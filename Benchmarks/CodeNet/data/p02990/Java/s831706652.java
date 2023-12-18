import java.util.*;
import java.math.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int M = 1000000007;
    long ao = 0;
    long aka = 0;
    for(int i=1; i<=K; i++){
      ao = nCk(K-1, i-1, M);
      aka = nCk(N-K+1, i, M);
      System.out.println((ao * aka) % M);
    }
  }
 
  public static long nCk(int n,int k,int M) {
    long ret = 1;
    int min = Math.min(k, n-k);
    for(int i=1;i<=min;i++) {
      ret = (ret * pow(i,M-2,M)) % M;
    }
    for(int i=n-min+1;i<=n;i++) {
      ret = (ret * i) % M;
    }
    return ret;
  }
 
  public static long pow(long a,long b,int M) {
    long ret = 1;
    long tmp = a;
    while(b>0) {
      if((b&1)==1) ret = (ret * tmp) % M;
      tmp = (tmp * tmp) % M;
      b = b>>1;
    }
    return ret;
  }
}