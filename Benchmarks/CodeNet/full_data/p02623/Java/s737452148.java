import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, K, sum = 0, res = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        int[] arr = new int[M + N];
        for (int i = 0; i < M + N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        while (K >= 0) {
            K -= arr[res];
            res++;
        }
        if (K < 0) res--;
        System.out.println(res);
    }
}
