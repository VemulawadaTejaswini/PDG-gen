import java.util.*;
public class Main{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = sc.nextInt();
      int[] x = new int[n];
      int[] l = new int[n];
      int g = 0;
      for(int i = 0;i < n;i++){
        x[i]=sc.nextInt();
        l[i]=Math.abs(a-x[i]);
        g = gcd(l[i],g);
      }
      System.out.println(g);
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