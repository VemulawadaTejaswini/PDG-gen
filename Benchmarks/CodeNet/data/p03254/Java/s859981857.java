import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextLong();
		}
		Arrays.sort(a);
		long sum = 0;
		for(int i=0;i<n;i++) {
			sum += a[i];
			if(i==n-1) {
				if(sum==x) System.out.println(n);
				else System.out.println(n-1);
				
			}
			if(sum>x) {
				System.out.println(i);
				break;
			}
			
		}
		

	}

}