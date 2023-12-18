import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long A[] = new long[N];
        int f[] = new int[40];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextLong();
            for(int k=0; k<40; k++) {
                f[k] += (((1L << k) & A[i]) != 0L) ? 1 : 0;
            }
        }
        long max=0;
        for(int t=0; t<=K; t++) {
            long sum=0;
            for(int k=0; k<40; k++) {
                sum+= ((t & (1L << k)) == 0) ? f[k] * (1L << k) : (N-f[k]) * (1L << k);
            }
            if(max<sum) max=sum;
        }
        System.out.println(String.format("%d", max));
    }
}
