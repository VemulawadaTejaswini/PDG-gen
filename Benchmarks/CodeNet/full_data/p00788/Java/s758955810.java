import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static int gcd(int x, int y){
		if(x == 0){
			return y;
		}else{
			return gcd(y % x, x);
		}
	}


	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		while (true) {
			final int p = sc.nextInt();
			final int n = sc.nextInt();
			
			if(p == 0 && n == 0){
				break;
			}
			
			final double ans = Math.sqrt(p);
			double less = Double.MIN_VALUE;
			double more = Double.MAX_VALUE;
			int less_u = 1, less_v = 1, more_x = 1, more_y = 1;
			
			//bottom
			for(int b = 1; b <= n; b++){
				
				//top
				int high_a = n;
				int low_a  = 1;
				while(high_a - low_a > 1){
					int mid_a = (high_a + low_a) / 2;
					
					double raito = (double) (mid_a) / b;
					
					if(ans < raito){
						high_a = mid_a;
					}else if(ans > raito){
						low_a = mid_a;
					}
				}
				
				double low_raito = (double) (low_a) / b;
				double high_raito = (double) (high_a) / b;
				
				if(low_raito < ans && low_raito > less){
					final int gcd = gcd(low_a, b);
					
					less   = low_raito;
					less_u = low_a / gcd;
					less_v = b / gcd;
				}
				
				if(high_raito > ans && high_raito < more){
					final int gcd = gcd(high_a, b);
					
					more   = high_raito;
					more_x = high_a / gcd;
					more_y = b / gcd;
				}
				
			}
			
			System.out.println(more_x + "/" + more_y + " " + less_u + "/" + less_v);
			
		}
	}

}