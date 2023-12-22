import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/08.
 */

public class Main {
    public static void main(String args[]) {
        int payment, sum, change;
        int money[] = {10, 50, 100, 500};
        int money_number[] = new int[4];
        int change_number[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int count = 0; ; count++){
            payment = sc.nextInt();
            if(payment == 0) break;
            sum = 0;
            for(int i = 0; i < 4; i++) {
                money_number[i] = sc.nextInt();
                change_number[i] = 0;
                sum += money[i] * money_number[i];
            }
            change = sum - payment;
            for(int i = 3; i >= 0; i--) {
                for(int j = 0; j <= money_number[i] && change / money[i] > 0; j++){
                    change_number[i]++;
                    change -= money[i];
                }
            }
            if(count > 0) System.out.println();
            for(int i = 0; i < 4; i++) {
                money_number[i] -= change_number[i];
                if(money_number[i] > 0) System.out.println(money[i] + " " + money_number[i]);
            }
        }
    }
}