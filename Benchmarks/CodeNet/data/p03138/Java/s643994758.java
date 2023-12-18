import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long[] Kbin = new long[40];
        for(int i = 0; K > 0; i++) {
            Kbin[i] = K & 1;
            K >>= 1;
        }
        long[] Abin_one = new long[40];
        for(int i = 0; i < N; i++) {
            long tmp = A[i];
            for(int j = 0; tmp > 0; j++) {
                Abin_one[j] += tmp & 1;
                tmp >>= 1;
            }
        }
        long[] Xbin = new long[40];
        for(int i = 0; i < 40; i++) {
            if(Abin_one[i] >= N - Abin_one[i]) Xbin[i] = 0;
            else Xbin[i] = 1;
        }
        for(int i = 39; i >= 0; i--){
			if(Kbin[i] == 1 && Xbin[i] == 0) break;
			if(Kbin[i] == 0 && Xbin[i] == 1) Xbin[i] = 0;
        }
        long ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 40; j++) {
                ans += (Xbin[j] ^ ((A[i] >> j) & 1)) << j;
            }
        }
        System.out.println(ans);
    }
}