import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] z = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            z[i] = sc.nextInt();
            sum += z[i];
        }
        int[] a = z;
        for (int d = 1; d < n; d++) {
            int[] b = a;
            a = new int[n - d];
            for (int i = 0; i < n - d; i++) {
                int j = i + d;
                a[i] = Math.min(b[i], z[j]);
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}