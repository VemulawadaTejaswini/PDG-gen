import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] tmpA = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).sorted().toArray();
        List<Long> A = new ArrayList<>();
        for(int i=0; i<N; i++) {
            A.add(tmpA[i]);
        }

        long ma = A.get(A.size()-1);
        long mi = A.get(0);
//        long mi = A.stream().min().getAsLong();
//        long ma = A.stream().max().getAsLong();
        long[] ans = new long[N];

        long max = 0;
        for(int i=0; i<N; i++) {
            long tmp = A.remove(i);
            max = Math.max(gcdAlpha(A), max);
            A.add(i, tmp);
        }
        System.out.println(max);
    }

    public static long gcdAlpha(List<Long> l){
        long an = gcd(l.get(0), l.get(1));
        for(int i=1; i<l.size()-1; i++){
            an = gcd(an, l.get(i+1));
        }
        return an;
    }

    public static long gcd(long a, long b){
        long t = a % b;
        if(t != 0){
            return gcd(b, t);
        }else{
            return Math.min(a, b);
        }
    }
}
