import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        long ok_key = 2_000_000_000_000_000_000L;
        long ng_key = -2_000_000_000_000_000_000L;
        while (Math.abs(ok_key-ng_key)>1) {

            long key = (ok_key+ng_key)/2;

            long cnt = 0L;
            for (int i=0;i<N-1;i++) {
                if (A[i]>=0) {
                    int ok = i;
                    int ng = N;
                    while (Math.abs(ok-ng)>1) {
                        int mid = (ok+ng)/2;
                        if ((long)A[mid]*A[i]<=key) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    cnt+=ok-i;
                } else { // A[i]<0
                    int ok = N;
                    int ng = i;
                    while (Math.abs(ok-ng)>1) {
                        int mid = (ok+ng)/2;
                        if ((long)A[mid]*A[i]<=key) {
                            ok = mid;
                        } else {
                            ng = mid;
                        }
                    }
                    cnt+=N-ok;
                }
                // System.out.println("ok: "+ok);
                // System.out.println("ok_cnt: "+(i));
            }

            if (cnt>=K) {
                ok_key = key;
            } else {
                ng_key = key;
            }
            // System.out.println("key, cnt: "+key+" "+cnt);
        }
        System.out.println(ok_key);
    }
}