import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;



public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		long sum = 0;
		long amari = (long)Math.pow(10, 9)+7;
		//System.out.println(amari);
		for(int i = 0; i < n - 1; ++i) {
			for(int j = i + 1; j < n ; ++j) {
				long temp = a[i] * a[j];
				sum = (sum+temp)% amari;
			}
		}
		
		System.out.println(sum);
	}
}

