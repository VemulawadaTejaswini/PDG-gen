import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = n - 1; 0 <= i; i--) {
            if (i > 0) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[i]);
            }
        }
        System.out.print("\n");
        sc.close();
    }
}
