import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Long n=sc.nextLong();
    Long m=sc.nextLong();
    if(Math.abs(n-m)>=2){
      System.out.println(0);
      return;
    }
    long ans=(calc(n)*calc(m))%1000_000_007;
    if(n==m){
      System.out.println((ans*2)%1000_000_007);
    }else{
      System.out.println(ans);
    }
  }
  static long calc(long n){
    long res=1;
    for(long i=1;i<=n;i++){
      res*=i;
      res%=1000_000_007;
    }
    return res;
  }
}
