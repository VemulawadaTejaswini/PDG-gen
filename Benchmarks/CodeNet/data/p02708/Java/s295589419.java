import java.util.*;

public class Main {
    static final long MOD = 1_000_000_007;
    static long N, K, first;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N = sc.nextLong();
        K = sc.nextLong();
        first = mod10(100);
        List<Range> allRanges = new ArrayList<>();
        long sum = 0;
        for(long k=K;k<=N+1;k++){
            sum += func(k);
            sum %= MOD;
        }

        System.out.println(sum);
    }

    private static long func(long k){
        return ((2*N-k+1)*k/2 - (k-1)*k/2+1) % MOD;
    }

    private static long mod10(int k){
        if(k == 0){
            return 1;
        }
        return mod10(k-1)*10 % MOD;
    }

    private static void getRangeForK(long k, List<Range> all){
        long s = (first*k + k*(k-1)/2 )% MOD;
        long e = (first*k + (2*N-k+1)*k/2 ) % MOD;
        if(e < s){
            all.add(new Range(0, e));
            all.add(new Range(s, MOD-1));
        }else{
            all.add(new Range(s, e));
        }
        return;
    }

    private static class Range{
        long s, e;
        Range(long s, long e){
            this.s = s;
            this.e = e;
        }
        @Override
        public String toString(){
            return s + "-" + e;
        }

    }


}
