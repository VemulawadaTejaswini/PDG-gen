import java.math.BigInteger;
import java.util.*;
public class Main {
	

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		final class Robot  {
			public long x;
			public long l;
		}
		int n = sc.nextInt();
		
		long[] x = new long[n]; 
		long[] l = new long[n];
		Robot[] robs = new Robot[n];
		

		
		long previous_x = Long.MIN_VALUE;
		
		long ans = 0;
		
		for(int i=0; i<n; i++) {
			Robot r = new Robot();
			r.x = sc.nextLong();
			r.l = sc.nextLong();
			
			robs[i] = r;
			
		}
		
		Arrays.sort(robs, Comparator.comparingLong(r -> r.x));
		
		for(int i=0; i<n; i++) {
			
			Robot r = robs[i];
			if (previous_x >= r.x - r.l + 1) {
				ans += 1;
			} else {
				previous_x = r.x + r.l - 1;
			}
		}
		
		System.out.println(n - ans);
		
		
		

		


		
		
	}
	


}

 