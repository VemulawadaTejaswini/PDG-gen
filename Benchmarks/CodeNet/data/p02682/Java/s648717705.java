
import java.util.*;
public class Main {
	public static void main ( String [] args) {
		Scanner input = new Scanner (System.in);
		int  a = 1 , b = 0 , c= -1;
		long x = input.nextLong();
		long y = input.nextLong();
		long z = input.nextLong();
		long k = input.nextLong();
		long sum=0;
		for (long i = 0; i < k; i++) {
			if (x>0) {
				sum++;
				x--;
			}
			else if (x==0 && y>0) {
				y--;
			}
			else if (x==0 && y==0 && z>0) {
				z--;
				sum--;
			}
			
			
		}
		System.out.println(sum);
		
	}

}
