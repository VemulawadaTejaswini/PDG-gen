import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
	
	public class Main {
	
		public static void main(String[] args) {
			execute18_1();
		}
		
		private static void execute18_1() {
			try 
			(Scanner sc = new Scanner(System.in)) {
				int n = sc.nextInt();
				long[] t= new long[n];
				
				for(int i=0;i<n;i++) {
					t[i] = sc.nextLong();
				}
				
				long ans=t[0];
				
				for(int i=1;i<n;i++) {
					ans=lcm2(ans, t[i]);
				}
				
			System.out.println(ans);
			}
		}
		
		private static long gcd2(long a, long b) {
	        if (b == 0) return a;
	        return gcd2(b, a % b);
	    }
		
		private static long lcm2(long m, long n) {
	        return m / gcd2(m, n) * n;
	    }
    }