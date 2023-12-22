
import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
    static int mod = 1000000007;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> posq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negq = new PriorityQueue<>();

        for (int i=0; i<N; i++){
            if (arr[i]<0)
                negq.offer(arr[i]);
            else
                posq.offer(arr[i]);
        }
        int candSize = Math.min(2*K,posq.size()+negq.size());
        int[] cand = new int[candSize];
        int j=0;
        for (; j<=K; j++){
            if (posq.size()==0)
                break;
            cand[j] = posq.poll();
        }

        for (int i= j; i<candSize; i++){
            if (negq.size()==0)
                break;
            cand[i] = negq.poll();
        }
        long res = 1;
        BigInteger result= BigInteger.ONE;
        for (int i=0; i<K; i++) {
//            res=res*cand[i]%mod;
            result = result.multiply(BigInteger.valueOf(cand[i]));
        }

        BigInteger ans = result;

        for (int i=K; i<candSize; i++){
//            res=(res%mod * modInv(cand[i-K],mod)%mod)%mod;
//            res = (res%mod * cand[i]%mod)%mod;
//            ans = Math.max(ans, res);
            result = result.divide(BigInteger.valueOf(cand[i-K]));
            result = result.multiply(BigInteger.valueOf(cand[i]));
            if (ans.compareTo(result)<0)
                ans = result;
        }
        System.out.println(ans.mod(BigInteger.valueOf(mod)));
    }

    public static long modInv(long n, long p){
        return pow(n, p-2, p);
    }

    public static long pow(long a, long n, long mod) {
        long res=1;
        while(n!=0) {
            if (n%2==1)
                res = (res%mod * a%mod)%mod;
            n/=2;
            a = (a%mod*a%mod)%mod;

        }
        return res;
    }



}
