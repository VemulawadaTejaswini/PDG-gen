import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long a = sc.nextLong();
        long b = sc.nextLong();
      long g=gcd(a,b);
      //int min=Math.min(a,b);
      int o=1;
      	for (int i=2;i<=g;i++){
          if(g%i==0 && b%i==0){
            o++;
            while(g%i==0)g=g/i;
          }
        }
	   System.out.println(o);
	}
  
  private static long gcd(long a, long b){
        
        if(b == 0){
            return a;
        }else{
            return gcd(b, a % b);
        }
    }
}