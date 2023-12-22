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
		for(int i = 0; i < n - 1; ++i) {
			sum+=a[i+1];
		}
		long ans = 0;
		for(int i = 0; i < n - 1; ++i) {
			ans+=a[i]*sum;
			ans%=(long)(Math.pow(10, 9)+7);
			sum-=a[i+1];
		}
		System.out.println(ans);
	}
}

