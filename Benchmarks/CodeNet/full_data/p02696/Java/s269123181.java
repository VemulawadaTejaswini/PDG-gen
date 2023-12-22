import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long n = sc.nextLong();
      
      	long ans = 0;
      	for(long x = 0; x <= Math.sqrt(n); x++){
          double tmp = Math.floor(a * x / b) - a * Math.floor(x / b);
          ans = Math.max(ans, (long)tmp);
        };
      
      	System.out.println(ans);
	}
}