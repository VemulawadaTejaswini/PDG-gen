import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] a = new int[N];
        int[] b = new int[N];
        List<Integer> pickup = new ArrayList<>();
        for ( int i = 0; i < N; i++ ) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            pickup.add(i);
        }
        
        Result s = calc(N, K, a, b, pickup);
        debug(s);
        System.out.println(s.sum);
    }

    private static class Result {
        private final long sum;
        private final long bitsum;
        public Result(long sum, long bitsum) {
            this.sum = sum;
            this.bitsum = bitsum;
        }

        public String toString() {
            return "[sum=" + sum + ",bitsum=" + bitsum + "]";
        }
    }

    private static Result calc(int N, int K
                                        , int[] a, int[] b, List<Integer> pickup) {
        if ( N == 0 ) return new Result(0L, 0L);
        if ( pickup.size() < 1 ) return new Result(0L, 0L);
        Collections.sort(pickup);
        int firstindex = pickup.get(0);
        if ( N == 1 ) {
                return a[firstindex] <= K 
                                    ? new Result(b[firstindex], a[firstindex])
                                     : new Result(0L, 0L);
        }
        Result result = new Result(0L,0L);
        int pickupSize = pickup.size();
        for ( int i = 0; i < pickupSize; i++ ) {
            List<Integer> p = new ArrayList<>();
            for ( int j = 0; j < pickupSize; j++ ) {
                if ( j == i ) continue;
                p.add(pickup.get(j));
            }
            Result r = calc(N-1, K, a, b, p);
            int pindex = pickup.get(i);
            long bitsum = r.bitsum | a[pindex];
            if ( bitsum <= K ) {
                r = new Result(r.sum + b[pindex], bitsum);
            }
            debug(r);
             if ( r.sum > result.sum ) {
                result = r;
            }
        }
        return result;
    }

    private static void debug(Object obj) {
//        System.out.println("#DEBUG: " + obj);
    }
}