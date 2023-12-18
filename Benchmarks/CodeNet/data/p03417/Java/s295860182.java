import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int x = Math.min(x,y);
      int y = Math.max(x,y);
      if(x==1&&y==1)System.out.println(1);
      else if(x==1)System.out.println(y-2);
      else System.out.println((x-1)*(y-1));
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