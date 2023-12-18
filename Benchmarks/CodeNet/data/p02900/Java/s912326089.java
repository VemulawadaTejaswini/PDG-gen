import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long g = gcd(a,b);
      long cnt = 1;
      boolean f = true;
      for(long i = 2;i <= g;i++){
      	for(long j = 2;j < i;j++)if(i%j==0)f = false;
        if(f&&g%i==0)cnt++;
        f = true;
      }
      System.out.println(cnt);
    }
    
    public static long gcd(long x, long y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}