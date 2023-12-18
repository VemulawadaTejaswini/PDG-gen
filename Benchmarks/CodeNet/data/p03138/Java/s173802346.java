import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        long A_max = 0;
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
            if(A_max < A[i]) A_max = A[i];
        }
        long ans = 0;
        long i = 1;
        while(i <= K) {
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
            i <<= 1;
        }
        while(i <= A_max) {
            for(int j = 0; j < N; j++) {
                if((A[j] & i) != 0) ans += i;
            }
            i <<= 1;
        }
        System.out.println(ans);
    }    
}