import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] xA = new int[n+1];
        for (int i = 0; i < n; i++) {
            xA[i] = sc.nextInt();
        }
        xA[n] = x;
        Arrays.sort(xA);

        int[] diffA = new int[n];
        for (int i = 0; i < n; i++) {
            diffA[i] = xA[i+1] - xA[i];
        }

        Arrays.sort(diffA);
        ans(diffA);
        System.out.println(diffA[0]);
    }

    public static int[] ans(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] % a[0] != 0) {
                a[0] = Euclid(a[i], a[0]);
                ans(a);
            }
        }
        return  a;
    }

    public static int Euclid(int a, int b) {
        if (a % b != 0) {
            b = Euclid(b, a%b);
        }
        return b;
    }
}
