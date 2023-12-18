import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      StringBuilder sb = new StringBuilder();
      for(int i=0;i<n;i++)sb.append(sc.next()+" ");
      int cnt = 1;
      int i = 0;
      while(sb.indexOf(String.valueOf(cnt),i)>=0){
        i=sb.indexOf(String.valueOf(cnt),i);
        cnt++;
      }
      System.out.println(n-cnt+1);
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
