
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt());
        int left[] = new int[n], right[] = new int[n];

        for (int i = 1; i < n; i ++) left[i] = gcd(left[i - 1], a[i - 1]);
        for (int i = n - 2; i >= 0; i --) right[i] = gcd(right[i + 1], a[i + 1]);

        int res = 1;
        for (int i = 0; i < n; i ++) res = Math.max(res, gcd(left[i], right[i]));

        System.out.println(res);

    }

    static int gcd(int a, int b) {
        if (a < b) {
            int temp = b;
            b = a;
            a = temp;
        }
        if (b == 0) return a;
        return gcd(a % b, b);
    }
}
