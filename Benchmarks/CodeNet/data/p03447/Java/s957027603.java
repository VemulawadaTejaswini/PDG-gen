import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int money = Integer.parseInt(sc.nextLine());
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        money -= a;
        while(money >= b){
            money -= b;
        }
        System.out.println(money);
    }
}
