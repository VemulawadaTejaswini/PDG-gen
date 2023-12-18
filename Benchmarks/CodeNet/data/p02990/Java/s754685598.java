import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      long cnt =0;
      long N = sc.nextInt();
      long K = sc.nextInt();
      
      for(long i=1;i<K+1;i++) {
       	  cnt = ( calcNumOfCombination(N-K+1,i) * calcNumOfCombination(K-1,i-1) ) % 1000000007;
    	  System.out.println(cnt);
      }
  }
  
  
 //組み合わせの数nCrを計算
  static long calcNumOfCombination(long n, long r){
	  double wk = 1;
	  for(long i=0; i<r; i++) {
		  wk = (wk * (n-i) / (r-i));
	  }
    return (long) Math.round(wk) % 1000000007;
}

//nPrの計算
static long Parmitation(long n, long r){
	  double wk = 1;
	  for(long i=0; i<r; i++) {
		  wk = (wk * (n-i));
	  }
//   	  System.out.println("n=" + n + " r=" + r + " wk=" + wk);
   	   return (long) Math.round(wk)  % 1000000007;
}

}