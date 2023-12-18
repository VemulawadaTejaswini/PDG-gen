import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
	long get(int[] Wi, int T) {
		long s1 = 0;
		long s2 = 0;
		
		for (int i=0; i<Wi.length; i++) {
			if (i <= T) {
				s1 += Wi[i];
			} else {
				s2 += Wi[i];
			}
		}
		
		return Math.abs(s1-s2);
	}
	
	
	public void solve() {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] Wi = new int[N];
		for (int i=0;i<N; i++) {
			Wi[i] = in.nextInt();
		}
		in.close();
		
		long min = Integer.MAX_VALUE;
		
		for (int i=0; i<N; i++) {
			long x = get(Wi, i);
			min = Math.min(min, x);
		}
		
		System.out.println(min);
		
	}
	
	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
	}
 
}
