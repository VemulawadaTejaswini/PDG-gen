import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < m; i++) {
			Arrays.sort(a);
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			
			for(int j = 0; j < b; j++) {
				if(a[j] < c) {
					a[j] = c;
				}
			}
		}
		
		long cnt = 0;
		for(int i = 0; i < n; i++) {
			cnt+= a[i];
		}
		System.out.println(cnt);
	}

}
