import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        long K = scan.nextInt();

        int[] arrN = new int[N];
        int[] arrM = new int[M];

        for (int i = 0; i < N; i++) {
            arrN[i] = scan.nextInt();
        }
        for (int i = 0; i < M; i++) {
            arrM[i] = scan.nextInt();
        }
        
        int n = 0, m = 0;

        int count = 0;
        long sum = 0;

        while (true) {
            if (n == N) {
                for (int i = m; i < M; i++) {
                    sum += arrM[i];
                    if (sum > K) {
                        System.out.println(count);
                        return;
                    } else count++;
                }
            } else if (m == M) {
                for (int i = n; i < N; i++) {
                    sum += arrN[i];
                    if (sum > K) {
                        System.out.println(count);
                        return;

                    } else count++;
                }
            } else {
                if (arrN[n] < arrM[m]) {
                    sum += arrN[n++];
                } else {
                    sum += arrM[m++];
                }
                if (sum > K) break;
                count++;
            }
        }

        System.out.println(count);


    }
}
