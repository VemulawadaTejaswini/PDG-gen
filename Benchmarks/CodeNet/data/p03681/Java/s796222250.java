import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long m = sc.nextLong();
      long INF = 1000000007;
      if(Math.abs(n-m)>=2){
      	System.out.println(0);
        return;
      }
      long x = 1;
      for(long i = 1;i <= n;i++)x = (x*i)%INF;
      for(long i = 1;i <= m;i++)x = (x*i)%INF;
      System.out.println(x);
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}