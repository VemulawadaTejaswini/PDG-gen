
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long xk = Math.abs(x)/d;
		long xr = Math.abs(x)%d;
		if( k % 2 == 0) xk+=1;
		long xkk = Math.min(k, xk);
		
		long xx = Math.abs(x - xkk*d);
		System.out.println( xx );
		
	}
}