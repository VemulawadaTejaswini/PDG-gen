import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long INF = (long)Math.pow(10, 9) + 7;
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextLong();
        }
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        long res = 0;
        for (int i = 0; i < a.length - 1; i++) {
            sum -= a[i];
            res += a[i] * sum;
            res %= INF;
        }
        System.out.println(res);
        sc.close();
    }
}