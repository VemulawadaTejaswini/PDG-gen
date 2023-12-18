import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(n)
        int n = sc.nextInt();

        int payment = n * 800;
        int rtnMoney = (n / 15) * 200;
        System.out.println(payment - rtnMoney);
        sc.close();
    }
}