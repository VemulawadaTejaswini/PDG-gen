import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      if(a>2*c&&b>2*c)System.out.println(2*c*Math.max(x,y));
      else if(a<=2*c&&b<=2*c&&a+b<=2*c)System.out.println(a*x+b*y);
      else if(a<=2*c&&b<=2*c&&a+b>2*c){
        int s = Math.min(x,y);
        if(s==x)System.out.println(2*c*s+(y-s)*b);
        else System.out.println(2*c*s+(x-s)*a);
      }
      else if(a<=2*c&&b>2*c)System.out.println(2*c*y+x*Math.max(x-y,0));
      else if(a>2*c&&b<=2*c)System.out.println(2*c*x+y*Math.max(y-x,0));
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