import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        double ans = 0;
        for (int i = 0; i < n; ++i) {
            int t = in.nextInt();
            ans += 1.0 / t;
        }
        System.out.println(1.0 / ans);
    }
}
