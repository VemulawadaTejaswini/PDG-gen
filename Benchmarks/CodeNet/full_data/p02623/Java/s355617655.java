import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long K = scanner.nextLong();

        int MAX = 0;

        long[] A = new long[N+1];
        A[0] = 0;

        for (int i = 1; i <= N; i++) {
            A[i] = scanner.nextLong() + A[i-1];
            if(A[i] <= K) MAX = i;
        }

        long T = 0;
        for (int i = 1; i <= M; i++) {
            T += scanner.nextLong();

            if(T > K) break;

            int L=-1, R = N+1;
            while(R-L > 1){
                int mid = L + (R-L)/2;
                if(T + A[mid] <= K){
                    L = mid;
                } else {
                    R = mid;
                }
            }
            if(T + A[L] <= K && MAX < i+L){
                MAX = i + L;
            }
        }

        System.out.println(MAX);
    }

    public static void main(String[] args) {
        new Main();
    }
}
