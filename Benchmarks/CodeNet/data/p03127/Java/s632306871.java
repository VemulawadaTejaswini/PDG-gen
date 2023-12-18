import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		execute12_1();
	}
	
	private static void execute12_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] a = new long[n]; 
			
			
			for(int i=0; i<n ;i++) {
				a[i] = sc.nextLong();
			}
			
			long ans = rr(a);
			
			System.out.println(ans);
			
		}
	}
	
	private static long rr(long[] a) {
		Arrays.sort(a);
		long INF = 100100100100L;
		if(a[1]==INF) return a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==INF) break;
			a[i] = a[i]%a[0];
			if(a[i]==0) a[i] = INF;
		}
		return rr(a);
	}
}