import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      if((n-1)%(k-1)==0)System.out.println((n-1)/(k-1));
      else System.out.println((n-1)/(k-1)+1)
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