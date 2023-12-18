import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	void run() {
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[] = new int[n];
		int cb[][] = new int[m][2];
		

		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i =0; i < m ;i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			cb[i][0] = c;
			cb[i][1] = b;
		}
		
		Arrays.sort(a);
		Arrays.sort(cb, (arr1,arr2) -> - Integer.compare(arr1[0], arr2[0]));
		
		int b2[] = new int[n];
		
		int j = 0;
		for(int i = 0 ;i < m ;i++) {
			for(int k = 0; k < cb[i][1]; k++) {
				if(j >= n) {
					break;
				}
				b2[j] = cb[i][0];
				j++;
			}
			if(j>=n) {
				break;
			}
		}
		
		int c[] = new int[n+j];
		
		for(int x = 0; x < n ;x++) {
			c[x] = a[x];
		}
		for(int x = 0; x < j ; x++) {
			c[x+n] = b2[x];
		}
		
		Arrays.sort(c);
		
		long sum =0;
		
		for(int x = j ; x < n+j;x++) {
			sum += c[x];
		}
		System.out.println(sum);
	}
}
