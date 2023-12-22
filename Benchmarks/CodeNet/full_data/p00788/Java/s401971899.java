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
			
			for(int a = 1; a <= n; a++){
				int high_b = n;
				int low_b = 1;
				
				while(high_b - low_b > 1){
					final int b = (high_b + low_b) / 2;
					
					double raito = (double)(a) / b;
					
					//System.out.println(a + " " + b  +" " + low_b + " " + high_b+ " " + ans + " " + raito);
					
					if(ans < raito){
						low_b = b;
					}else if(ans > raito){
						high_b = b;
					}
				}
				
				//System.out.println(a + " " + low_b + " " + high_b);
				
				double n_less = (double)(a) / high_b;
				if(ans > n_less && less < n_less){
					final int gcd = gcd(a, high_b);
					less = n_less;
					less_u = a / gcd;
					less_v = high_b / gcd;
				}
				
				double n_more = (double)(a) / low_b;
				//System.out.println(n_more + " " + more);
				if(ans < n_more && more > n_more){
					final int gcd = gcd(a, low_b);
					more = n_more;
					more_x = a / gcd;
					more_y = low_b / gcd;
				}
			}
			
			System.out.println(more_x + "/" + more_y + " " + less_u + "/" + less_v);
			
		}
	}

}