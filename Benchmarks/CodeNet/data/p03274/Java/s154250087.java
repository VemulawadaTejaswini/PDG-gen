
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        long res = 1L << 60;
        long tmp = 1L << 60;
        for(int j = 0; j + K - 1 < N; j++) {
            int left = a[j];
            int right = a[j + K - 1];
            tmp = Math.min(Math.abs(left) + Math.abs(left - right), Math.abs(right) + Math.abs(left - right));
            res = Math.min(res, tmp);
        }
        System.out.println(res);
    }
}
