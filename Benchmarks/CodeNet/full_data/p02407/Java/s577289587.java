import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i]	= sc.nextInt();
			b[(n-1)-i]	= a[i];
		}
		
		for(int out: b) {
			System.out.print(out);
		}
		System.out.print("\n");
		
	}
}