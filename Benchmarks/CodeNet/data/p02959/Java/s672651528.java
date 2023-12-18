import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for (int i = 0; i < n+1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int d = Math.min(a[i], b[i]);
            count += d;
            a[i] -= d;
            b[i] -= d;

            int d2 = Math.min(a[i+1], b[i]);
            count += d2;
            a[i] -= d2;
            b[i] -= d2;
        }

        System.out.println(count);
    }
}