import java.util.Scanner;

/**
 * Created by Reopard on 2014/05/08.
 */

public class Main {
    public static void main(String args[]) {
        int payment, sum, change,pre_money_number;
        int money[] = {10, 50, 100, 500};
        int money_number[] = new int[4];
        int change_number[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int count = 0; ; count++){
            payment = sc.nextInt();
            if(payment == 0) break;
            sum = 0;
            pre_money_number = -1;
            for(int i = 0; i < 4; i++) {
                money_number[i] = sc.nextInt();
                change_number[i] = 0;
                sum += money[i] * money_number[i];
            }
            change = sum - payment;
            for(int i = 3; i >= 0; i--) {
                while (change / money[i] > 0 && money_number[i] > 0) {
                    money_number[i]--;
                    change -= money[i];
                }
                if(change / money[i] > 0 && money_number[i] == 0) change -= money[i];
            }
            if(count > 0) System.out.println();
            for(int i = 0; i < 4; i++) {
                if(money_number[i] != 0) System.out.println(money[i] + " " + money_number[i]);
            }
        }
    }
}