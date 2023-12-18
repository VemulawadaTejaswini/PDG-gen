import java.util.*;
public class Main {
  	static int mod = 1000000007;
  static int size = 200001;
	static long[] fac = new long[size];
	static long[] finv = new long[size];
	static long[] inv = new long[size];
	static int INF = Integer.MAX_VALUE;
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	int N = sc.nextInt();
  long[] A = new long[N+1];
  long[] B = new long[N];
  int i=0;
  long count=0;
  for(i=0;i<N+1;i++){
    A[i]=sc.nextLong();
  }
  for(i=0;i<N;i++){
    B[i]=sc.nextLong();
  }

  for(i=N;i>0;i--){
    if(A[i]>B[i-1]){
      count+=B[i-1];
    }else if(A[i]+A[i-1]>B[i-1]){
      count+=B[i-1];
      A[i-1]=A[i]+A[i-1]-B[i-1];
    }else{
      count+=A[i]+A[i-1];
      A[i-1]=0;
    }
  }

System.out.println(count);

} 

 //fac, inv, finvテーブルの初期化、これ使う場合はinitComb()で初期化必要
	public static  void initComb(){
		fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
		for (int i = 2; i < size; ++i) {
			fac[i] = fac[i - 1] * i % mod;
			inv[i] = mod - (mod / i) * inv[(int) (mod % i)] % mod;
			finv[i] = finv[i - 1] * inv[i] % mod;
		}
	}
 
	//nCk % mod
	public static long comb(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
		return fac[n] * finv[k] % mod * finv[n - k] % mod;
	}
 
	//n! % mod
	public static long fact(int n){
		return fac[n];
	}
 
	//(n!)^-1 with % mod
	public static long finv(int n){
		return finv[n];
	}
  
}