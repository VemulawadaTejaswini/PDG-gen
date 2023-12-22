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
		execute13_1();
	}

	private static void execute13_2() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int q = sc.nextInt();
			int[] a = new int[n];
			
			long ans =0L;
			for(int i=1; i<m; i++) {
				for(int j=0; j<n; j++) {
					
				}
			}
			
			
			System.out.println(ans);
		}

	}
	
	private static int rr() {
		
		rr();
		return 0;
	}

	private static void execute13_1() {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			long b = sc.nextLong();
			long n = sc.nextLong();

			long x = 0;
				x = Math.min(n, b - 1);
			long ans = (long) (Math.floor(a * x / b) - a * Math.floor(x / b));

			
			System.out.println(ans);
		}

	}
}