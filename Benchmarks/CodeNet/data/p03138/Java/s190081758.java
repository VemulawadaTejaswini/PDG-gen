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
        long ans = 0;
        if(K == 0) {
            for(int i = 0; i < N; i++)
                ans += A[i];
        }
        else {
            for(long i = 1; i <= K; i <<= 1) {
                long tmp = 0;
                for(int j = 0; j < N; j++) {
                    if((A[j] & i) != 0) tmp++;
                    else tmp--;
                }
                if(tmp >= 0) {
                    for(int j = 0; j < (tmp+N)/2; j++)
                        ans += i;
                } else {
                    for(int j = 0; j < (N-tmp)/2; j++)
                        ans += i;
                }
            }
        }
        System.out.println(ans);
    }    
}