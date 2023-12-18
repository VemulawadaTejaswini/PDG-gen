import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0;i<n;i++)a[i]=sc.nextInt();
      int k = 0;
      int cnt = 1;
      for(int i=0;i<n;i++){
        if(a[i]==cnt){
          cnt++;
        }
      }
      if(cnt==1)System.out.println(-1);
      else System.out.println(n-cnt+1);
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