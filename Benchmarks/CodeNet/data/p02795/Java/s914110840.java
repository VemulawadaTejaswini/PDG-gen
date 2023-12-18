import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int h = sc.nextInt();
      int w = sc.nextInt();
      int n = sc.nextInt();
      System.out.println(n/Math.max(h,w));
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
class Pair{
    int a,b;

    Pair(int a, int b){
      this.a = a;
      this.b = b;
    }
}