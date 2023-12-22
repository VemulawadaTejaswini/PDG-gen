import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 100;
        double interest = 1.01;
        int count = 0;
        long _x = sc.nextLong();
        while (money < _x){
            money *= interest;
            count += 1;
        }
        System.out.print(count);
    }
}
