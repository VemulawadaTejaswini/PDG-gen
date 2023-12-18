import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        long A[] = new long[N];
        long B[] = new long[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }

        /*
        boolean tf[] = new boolean[N];
        int KK = K;
        for(int t=0; t<N; t++) {
            tf[t] = (KK % 2 == 1);
            System.out.println(String.format("tf[%d]=%s", t, tf[t] ? "o" : "x"));
            KK = KK >> 1;
        }
        */
        long NN = 1;
        for(int i=0; i<=N; i++) {
            NN *= 2;
        }
        long result = 0;
        for(int i=0; i<NN; i++) {
            long tmp = calc(A, B, N, i, K);
            if(tmp>result) result = tmp;
        }
//        System.out.println(String.format("maximum is %d.", result));
        System.out.println(String.format("%d", result));
    }

    private static long calc(long[] A, long[] B, int N, int KK, long maxcost) {
        long cost = 0, value = 0;
        for(int t=0; t<N; t++) {
            if(KK % 2 == 1) {
                cost |= A[t];
                if(cost > maxcost) {
                    //System.out.println("over cost");
                    return 0;
                }
                value += B[t];
            }
            KK = KK >> 1;
        }
        //System.out.println(String.format("cost=%d, value=%d", cost, value));
        return value;
    }
}