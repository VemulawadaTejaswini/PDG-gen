import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[] = new int[n+1];
		a[0] = 0;
		for(int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int b, c;
		for(int i = 1; i <= m ; i++){
			b = sc.nextInt();
			c = sc.nextInt();
			int cnt = 0;
			for(int j = 1; j <= b; j++) {
				a[j] = Math.max(a[j], c);
			}
		}
		
		long sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += a[i];
		}
		
		System.out.println(sum);
	}
}
		