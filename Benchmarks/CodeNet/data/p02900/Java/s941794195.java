import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long a = sc.nextLong();
      long b = sc.nextLong();
      long g = gcd(a,b);
      long cnt = 1;
      if(g%2==0){
      	while(g%2==0){g/=2;}
        cnt++;
      }
      long i = 3;
      while(i <= g){
        if(g%i==0){
      		while(g%i==0){
        		g/=i;
        	}
            cnt++;
        }
        i+=2;
      }
      System.out.println(cnt);
    }
    
    public static long gcd(long x, long y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}
