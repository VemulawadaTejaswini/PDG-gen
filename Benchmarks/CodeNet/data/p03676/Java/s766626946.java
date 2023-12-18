import java.math.BigInteger;
import java.util.*;

public class Main {
    public static BigInteger[] fact;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a;
        int firInd = 0;
        int secInd = 0;
        Map appeared = new HashMap();

        for (int i=0; i<n+1; i++) {
            a = sc.nextInt();
            if ( appeared.containsKey(a) ) {
                secInd = i;
                firInd = (int) appeared.get(a);
                //System.out.println("Repeated number=" + a + "firInd, secInd" + firInd + " " + secInd);
                break;
            } else {
                appeared.put(a, i);
            }
        }

        fact = new BigInteger[n+2];
        //store factorials
        fact[0] = BigInteger.valueOf(1);
        for (int i=1; i<=n+1; i++) {
            fact[i] = fact[i-1].multiply(BigInteger.valueOf(i));
        }

        BigInteger totalComb, repComb;
        // 0..(count before f=f)..f....s..(count after s=n-s)..n
        //for (int i=2; i<=2; i++) {
        for (int i=1; i<=n+1; i++) {
            totalComb = comb(n+1, i); repComb = BigInteger.valueOf(0);
            //System.out.println("totalComb=" + totalComb);
            for (int cF=0; cF<=i-1; cF++) {
                //System.out.println("i=" + i + " cF=" + cF);
                int cS = i-1-cF;
                if (cF > firInd || cS > n-secInd) { continue; }
                repComb = repComb.add(comb(firInd, cF).multiply(comb(n-secInd, cS)));
            }
            System.out.println(totalComb.subtract(repComb).mod(BigInteger.valueOf(1000000007)));
        }
    }

    public static BigInteger comb(int n, int k) {
        //System.out.println("comb n,k=" + n + " " + k);
        if (k==0 || k==n) { return BigInteger.valueOf(1); }
        if (k==1 || k==n-1) {return BigInteger.valueOf(n); }
        return fact[n].divide(fact[k].multiply(fact[n-k]));
    }
}
