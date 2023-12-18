import java.util.Scanner;
import java.io.BufferedInputStream;
import java.lang.Math;
import java.util.*;

public class Main{
    static long tmp = 10000 * 10000;
    static long MAX_COUNT = tmp * tmp + 999;

    static int N;
    static long K = 0;
    static long [] A;

    public static void main(String [] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        N = sc.nextInt();
        A = new long [N];
        long sum = 0;
        for(int i = 0; i < N ; i++) {
            A[i] = sc.nextLong();
            sum = sum + A[i];
        }
        K = sum - (N-1) * N;
        if(K > 0) {
            decreaseK();
        } else {
            K = 0;
        }
        while(decrease());
        System.out.println(K);
    }

    static boolean decrease() {
        boolean ok = true;
        for(int i = 0; i < N; i++) {
            if(A[i] >= N) {
                ok = false;
            }
        }
        // System.out.println(Arrays.toString(A));
        if(ok) return false;
        int p = 0;
        for(int i = 0; i < N; i++) {
            if(A[i] > A[p]) {
                p = i;
            }
        }
        for(int i = 0; i < N; i++) A[i] = A[i] + 1;
        A[p] = A[p] - N - 1;
        K = K + 1;
        return true;
    }

    static void decreaseK() {
        for(int i = 0; i < N; i++) {
            A[i] = A[i] + K;
        }
        long l = 0, r = MAX_COUNT * 4;
        while(r - l > 1) {
            long mid = (r + l) / 2;
            if(totalCount(mid) > K)
                l = mid;
            else r = mid;
        }
        long sum = totalCount(r);
        for(int i = 0; i < N; i++) {
            long cnt = count(A[i]-r);
            A[i] = A[i] - cnt * (N + 1);
            A[i] = A[i] - K + sum;
        }
        K = sum;
    }

    static long totalCount(long limit) {
        long ret = 0;
        for(int i = 0; i < N; i++) {
            ret = ret + count(A[i] - limit);
        }
        return ret;
    }

    static long count(long x) {
        if(x <= 0) return 0;
        long cnt = x / (N + 1);
        if(x % (N + 1) > 0) {
            cnt += 1;
        }
        return cnt;
    }
}
