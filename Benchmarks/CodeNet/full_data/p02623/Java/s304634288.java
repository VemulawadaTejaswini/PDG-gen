import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N, M, K, res = 0;
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        int[] arr = new int[M + N];
        for (int i = 0; i < M + N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < M + N; i++) {
            if ((K -= arr[i]) >= 0) res++;
            else break;
        }
        System.out.println(res);
    }
}
