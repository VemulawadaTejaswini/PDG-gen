import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      long g  = 1;
      for(int i = 0;i < n;i++){
      	g = lcm(g,sc.nextLong());
      }
      System.out.println(g);
    }
    public static long lcm(long x, long y){
      return x*y/gcd(x,y);
    }
    public static long gcd(long x, long y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}