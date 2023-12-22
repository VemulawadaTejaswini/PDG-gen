
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int year = 0;
        double money = 100;
        sc.close();
        while(true){
            money = Math.floor(money * 1.01);
            year++;
            if(x <= money){
                System.out.println(year);
                return;
            }
        }
    }
}