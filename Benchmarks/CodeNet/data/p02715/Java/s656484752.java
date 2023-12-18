import java.util.*;
import java.lang.*;
class Mod{
    static final int MOD = 1000_000_007;
    static final int[] fact, factInv;
  	static {
      int size = 80_000_000;
      fact = new int[size];
      fact[0]=1;
      for(int i=1;i<fact.length;i++){
        fact[i]=mult(fact[i-1],i);
      }
      factInv = new int[size];
      factInv[size - 1] = inverse(fact[size - 1]);
      for (int i = size - 2;i >= 0;-- i) {
        factInv[i] = mult(factInv[i + 1], i + 1);
      }
    }

    public static int add(int a, int b){
        int tmp = (a+b)%MOD;
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static int adds(int... ar){
        int ans=0;
        for(int x:ar) ans = Mod.add(ans, x);
        return ans;
    }
    public static int sub(int a, int b){
        return add(a,-b);
    }
    public static int mult(int a, int b){
        int tmp = (int)((long)a*b%MOD);
        return tmp>=0 ? tmp : tmp+MOD;
    }
    public static int mults(int... ar){
        int ans=1;
        for(int x:ar) ans = Mod.mult(ans, x);
        return ans;
    }
    public static int power(int a, int x){ //calculate a^x
        if(x<0)return 0;
        if(x==0)return 1;
        if(x%2==0) {
            int half = power(a,x/2);
            return mult(half,half);
        }
        return (int)((long)a*power(a,x-1) % MOD);
    }
    public static int inverse(int a){
        return power(a,MOD-2);
    }
    public static int div(int a, int b){
        return mult(a, inverse(b));
    }
  	
    public static int combination(int n, int r){
        int N = n,  R = r;
        if(n<0 || r<0 || n<r) return 0;
        return mults(fact[N],factInv[R],factInv[N-R]);
    }
    public static int permutation(int n, int r){
        int N = n,  R = r;
        if(n<0 || r<0 || n<r) return 0;
        return mult(fact[N], factInv[N-R]);
    }
}

public class Main {
    static int count(int N, int K, int M){
        return Mod.power(K/M, N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long startTime = System.currentTimeMillis();
        int[] ans = new int[K+1];
        for(int k=K; k>0; k--){
            ans[k] = count(N, K, k);
            for(int i=2; i*k<=K; i++) ans[k] = Mod.sub(ans[k], ans[i*k]);
        }

        int total = 0;
        for(int k=1; k<=K; k++) total = Mod.add(total, Mod.mult(k, ans[k]));
        System.err.printf("%.3f sec\n", (System.currentTimeMillis()-startTime)*0.001);
        System.out.println(total);
    }
}
