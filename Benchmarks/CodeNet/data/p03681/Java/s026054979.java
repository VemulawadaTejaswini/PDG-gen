import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long m = sc.nextInt();
    long mod = 1000000007;
    sc.close();
    long a = 1;
    for (long i =1;i<=Math.min(m,n);i++){
      a = (a*i)%mod;
    }
    if (n==m){
      System.out.println((2*a*a)%mod);
    }else if (n-1==m||n+1==m){
      System.out.println((a*a*Math.max(m,n))%mod);
    }else{
      System.out.println(0);
    }
  }
}