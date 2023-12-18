import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt() - (i + 1);
            total += a[i];
        }
        
        long b = total / n;
        long rem = total % n;
        if (rem >= 0) {
            if (rem >= (double) n / 2) {
                b++;
            }
        } else {
            rem += n;
            if (rem >= (double) n / 2) {
                b--;
            }
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - b);
        }

        System.out.println(ans);
    }
}