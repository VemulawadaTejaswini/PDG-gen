import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if(Math.abs(n-m)>2){
      System.out.println(0);
      return;
    }
    if(n==m){
      System.out.println(((calc(n)*calc(m))%1000_000_007*2)%1000_000_007);
    }else{
      System.out.println((calc(n)*calc(m))%1000_000_007);
    }
  }
  static long calc(long n){
    long res=1;
    for(long i=1;i<=n;i++){
      res*=i;
      res%=1000000007;
    }
    return res;
  }
}
