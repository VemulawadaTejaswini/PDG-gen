import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int alice = 0;
        int bob = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    bob += a[i];
                } else {
                    alice += a[i];
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 1) {
                    bob += a[i];
                } else {
                    alice += a[i];
                }
            }
        }
        System.out.println(alice - bob);
    }
}