import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        if ((a[n - 2] ^ a[n - 1] ^ a[0]) != 0 || (a[n - 1] ^ a[0] ^ a[1]) != 0) {
            System.out.println("No");
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            if ((a[i - 1] ^ a[i] ^ a[i + 1]) != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
