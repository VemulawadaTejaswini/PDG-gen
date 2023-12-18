import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n  =sc.nextInt();
      int k = sc.nextInt();
      int m = 0;
      int s = 0;
      m = n/k;
      if(k%2==0){
        s = (n+k/2)/k;
      }
      System.out.println(m*m*m+s*s*s);
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
