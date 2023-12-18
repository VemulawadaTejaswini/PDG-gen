import java.util.*;

public class Main{
  static int p = 1000000007;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = X+Y;
    int d = Z/3;
    int e = (d-Math.abs(X-Y))/2;
    
    //Zが3の倍数でなければ不適、eが0未満でも不適
    if(Z%3 != 0 || e < 0){
      System.out.println(0);
      return;
    }

    //C(d,e)を求める前準備
    long A = 1; // d!/(d-e)!
    long B = 1; // e!
    for(int i = 0; i < e; i++){
      A *= d-i;
      A %= p;
      B *= e-i;
      B %= p;
    }
    //直接割ることはできないのでinvメソッドで逆元を求めて掛け算
    long ans = A * inv(B, p-2) % p;
    System.out.println(ans);
  }
  // 1/n ≡ n^p-2(mod p)を求める（二分累乗法）
  public static long inv(long n, int k){
    if(k == 0){
      return 1;
    }
    
    if(k%2 == 0){
      long l = inv(n, k/2);
      return l * l % p;
    }else{
      return n * inv(n, k-1) % p;
    }
  }
}
