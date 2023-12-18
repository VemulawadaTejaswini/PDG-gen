import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        long ans;
        if (n == 1) {
            if (m == 1) {
                ans = 1;
            } else {
                ans = m - 2;
            }
        } else {
            if (m == 1) {
                ans = n - 2;
            } else {
                ans = (n - 2) * (m - 2);
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
