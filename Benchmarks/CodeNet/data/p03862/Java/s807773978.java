import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      int res = 0;
      for(int i = 0;i < n-1;i++){
      	if(a[i+1]+a[i]>x){
          res+=a[i+1]+a[i]-x;
       	  a[i+1] = Math.max(x-a[i],0);
        }
      }
      System.out.println(res);
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
