import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      int g = 0;
      int max = 0;
      for(int i = 0;i < n;i++){
        a[i]=sc.nextInt();
        g = gcd(g,a[i]);
        max = Math.max(max,a[i]);
      }
      if(k%g==0&&k<=max)System.out.println("POSSIBLE");
      else System.out.println("IMPOSSIBLE");
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