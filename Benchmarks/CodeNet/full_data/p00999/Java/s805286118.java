import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int a = sc.nextInt();
			final int b = sc.nextInt();
			final int c = sc.nextInt();
			final int d = sc.nextInt();
			final int e = sc.nextInt();
			
			if(a == 0 && b == 0 && c == 0 && d == 0 && e == 0){
				break;
			}
			
			final int na = sc.nextInt();
			final int nb = sc.nextInt();
			final int nc = sc.nextInt();
			
			final int sum = na + nb + nc;
			
			final int full = na * a + nb * b + nc * c;
			//System.out.println(full);
			int min = full;
			
			for(int inc = 1; inc <= sum; inc++){
				int rest = inc;
				
				int cur = full;
				
				
				
				// c
				final int c_c = Math.min(nc, rest);
				cur -= c_c * c;
					
				if(inc < d){
					cur += d * e;
				}else{
					cur += c_c * e;
				}
				rest = Math.max(0, rest - c_c);
				
				// b
				final int b_c = Math.min(nb, rest);
				cur -= b_c * b;
				if(inc >= d){
					cur += b_c * e;
				}
				
				rest = Math.max(0, rest - b_c);
				
				// a
				final int a_c = Math.min(na, rest);
				cur -= a_c * a;
				if(inc >= d){
					cur += a_c * e;
				}
				
				rest = Math.max(0, rest - a_c);
				
				//System.out.println(inc + " " + cur);
				
				min = Math.min(min, cur);
			}
			
			System.out.println(min);
		}
	}

}