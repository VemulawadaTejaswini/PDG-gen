import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();

        double tmp = Math.pow(100, d);
        double ans = (tmp * n);

        System.out.println((int)ans);
    }
}
