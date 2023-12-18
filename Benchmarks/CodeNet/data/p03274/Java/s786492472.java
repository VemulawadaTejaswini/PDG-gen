import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] x = new int[n];
      for(int i = 0;i < n;i++)x[i]=sc.nextInt();
      int min = 1000000000;
      for(int i = 0;i < n-k;i++){
      	int r = x[i+k-1];
        int l = x[i];
        min = Math.min(min,Math.min(Math.abs(r-l)+Math.abs(r),Math.abs(r-l)+Math.abs(l)));
      }
      System.out.println(min);
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