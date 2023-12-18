import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(x>=y)System.out.println(Math.min(a*x+b*y,Math.min(2*c*x,2*c*y+(x-y)*a)));
      else System.out.println(Math.min(a*x+b*y,Math.min(2*c*y,2*c*x+(y-x)*b)));
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