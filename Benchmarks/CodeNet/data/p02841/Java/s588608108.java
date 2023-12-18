import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int m1 = sc.nextInt();
      int d1 = sc.nextInt();
      int m2 = sc.nextInt();
      int d2 = sc.nextInt();
      if(d2==1)System.out.println(1);
      else System.out.println(0);
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