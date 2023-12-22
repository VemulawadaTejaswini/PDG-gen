import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n, k;
            n = sc.nextInt(); k = sc.nextInt();
            if (n == 0 && k == 0) break;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int ans = solve(a, n, k);
            System.out.println(ans);
        }
    }

    public static int solve(int[] a, int n, int k) {
        int max_sum = -100000;
        int sum = 0;
        for (int i = 0; i + k < n; i++) {
            for (int j = i; j < i + k; j++) {
                sum += a[j];
            }
            if (sum > max_sum) max_sum = sum;
            sum = 0;
        }
        return max_sum;
    }

}