import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(a);
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
