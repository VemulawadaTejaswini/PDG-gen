import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {
	static int n, max;
	static int[] S;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		S = new int[n]; max = 0;
		for(int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
			max = max(max, S[i]);
		}
		return true;
	}
	
	static void solve() {
		int cnt;
		int[] C, prev, hist;
		C = S; prev = S; 
		for(cnt = 0; ; cnt++) {

			hist = new int[max+1];
			int sum;
			for(int i = 0; i <= max; i++) {
				sum = 0;
				for(int j = 0; j < C.length; j++) {
					if(C[j] == i) sum++;
				}
				hist[i] = sum;
			}
			
			prev = C.clone();
			for(int i = 0; i < C.length; i++) {
				C[i] = hist[C[i]];
				max = max(max, C[i]);
			}
			if(Arrays.equals(C, prev)) break;
		}
		
		System.out.println(cnt);
		for(int i = 0; i < C.length; i++) System.out.print(((i == C.length-1) ? "" + C[i] + "\n" : C[i] + " " ));
		
	}
	
	/*
	static boolean same(int[] a, int[] b) {
		int len = a.length;
		boolean res = true;
		for(int i = 0; i < len; i++) {
			if(a[i] != b[i]) {
				res = false;
				break;
			}
		}
		return res;
	}
	*/
	
	public static void main(String[] args) {
		while(read()) {
			solve();
		}
	}

}