import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long temp = Long.parseLong(sc.next());
            a[i] = temp;
            sum += temp - (i + 1);
        }
        long sub = (long)Math.floor(sum * 1.0 / n);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - (sub + i + 1));
        }
        System.out.println(ans);
    }
}