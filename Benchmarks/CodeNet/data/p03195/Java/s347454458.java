import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ans += a[i] % 2;
        }
        Arrays.sort(a);
        long sa = a[n - 1] - a[0];
        if (sa % 2 == 1) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }

    }
}