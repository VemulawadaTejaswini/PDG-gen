import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N, M, K, res = 0;
        N = sc.nextLong();
        M = sc.nextLong();
        K = sc.nextLong();
        Long[] arr = new Long[(int)(M + N)];
        for (int i = 0; i < M + N; i++) {
            arr[i] = sc.nextLong();
        }
        Arrays.sort(arr);
        for (int i = 0; i < M + N; i++) {
            if ((K -= arr[i]) > 0) res++;
            else break;
        }
        System.out.println(res);
    }
}
