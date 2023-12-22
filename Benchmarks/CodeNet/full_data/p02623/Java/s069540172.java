import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextInt();
        long[] A = new long[N+1];
        long[] B = new long[M+1];
      	A[0] = 0;
      	B[0] = 0;
      	int n_max = N;
      	int m_max = M;
        for (int i = 1; i < N + 1; i++) {
        	A[i] = A[i-1] + sc.nextLong();
          	if (A[i] > K) {n_max = i - 1; break;}
        }
        for (int i = 1; i < M + 1; i++) {
          	B[i] = sc.nextLong();
          	if (B[i] > K) {m_max = i - 1; break;}
        }

        long sumTime = 0;
        int book = 0;
        int maxBook = 0;
      	int m;
        for (int n = 0; n <= n_max; n++) {
          	sumTime = A[n];
          	m = 0;
            while (m <= m_max) {
            	sumTime += B[m];
              	if (sumTime > K) {break;}
              	m++;
            }
          	book = n + m - 1;
          	if (maxBook < book) {maxBook = book;}
        }
        System.out.println(maxBook);
    }
}