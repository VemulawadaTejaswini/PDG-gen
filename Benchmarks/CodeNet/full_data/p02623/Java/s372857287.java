import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();

        long[] a = new long[N+1];
        long[] b = new long[M+1];
        for (int i = 1; i <= N; i++) {
            a[i] += a[i-1] + sc.nextInt();
        }

        for (int i = 1; i <= M; i++) {
            b[i] += b[i-1] + sc.nextInt();
        }
        
        int max = 0;
        int idx = M;
        for (int i = 0; i <= N; i++) {
            long diff = K - a[i];
            if (diff < 0) {
                break;
            }

            int j = idx;
            while (j >= 0) {
                if (diff >= b[j]) {
                    max = Math.max(max, i+j);
                    break;
                } else {
                    idx = j--;
                }
            }
        }
        
        System.out.println(max);
    }
}
