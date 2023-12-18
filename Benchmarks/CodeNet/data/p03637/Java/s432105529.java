import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scan.nextInt();
        }
        int odd = 0;
        int four = 0;
        for (int i = 0; i < N; i++) {
            if (a[i] % 2 == 1) {
                odd += 1;
            }
            if (a[i] % 4 == 0) {
                four += 1;
            }
        }
        if (odd == 0) {
            System.out.println("Yes");
            return;
        }
        if (N == 2) {
            if (1 <= four) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }
        if (N == 3) {
            if (2 < odd) {
                System.out.println("No");
            } else if (odd == 2 && 1 <= four) {
                System.out.println("Yes");
            } else if (odd == 1 && 1 <= four) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            return;
        }
        if (2 < odd) {
            System.out.println("No");
        } else if (odd == 2 && 2 <= four) {
            System.out.println("Yes");
        } else if (odd == 1 && 1 <= four) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
