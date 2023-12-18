import java.util.*;
public class Main{
  static int p = 1000000007;
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    if((2*X-Y)%3!=0||(2*Y-X)%3!=0){
      System.out.println(0);
      return;
    }
    int a = (2*Y-X)/3;
    int b = (2*X-Y)/3;
    if(a<0||b<0){
      System.out.println(0);
      return;
    }
    int max = 2000000;

    
    long fac[] = new long[max];
    long finv[] = new long[max];
    long inv[] = new long[max];

// テーブルを作る前処理
    fac[0] = fac[1] = 1;
    finv[0] = finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < max; i++){
        fac[i] = fac[i - 1] * i % p;
        inv[i] = p - inv[p%i] * (p / i) % p;
        finv[i] = finv[i - 1] * inv[i] % p;
    }
    
    long answer = COM(a+b,a,fac,finv);
    System.out.println(answer);

    
  }
  // 二項係数計算
    public static long COM(int n, int k,long[] fac,long[] finv){
    if (n < k) return 0;
    if (n < 0 || k < 0) return 0;
    return fac[n]*(finv[k]*finv[n-k]%p)%p;
}
  

  
}