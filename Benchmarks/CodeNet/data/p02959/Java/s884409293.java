import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] a = new long[N + 1];
        for (int i = 0; i < N + 1; i++) {
            a[i] = scanner.nextLong();
        }
        long[] b = new long[N];
        for (int i = 0; i < N; i++) {
            b[i] = scanner.nextLong();
        }

        long result = 0;
        long defeated;
        for (int i=0; i < N; i++) {
            defeated = Math.min(a[i], b[i]);
            result += defeated;
            defeated = Math.min(a[i+1], b[i]-defeated);
            a[i+1] -= defeated;
            result += defeated;
        }
        System.out.println(result);
    }
}