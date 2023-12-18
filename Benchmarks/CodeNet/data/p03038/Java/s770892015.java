import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		long[] a = new long[n];
		for (int i =0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		for (int i =0; i<m; i++) {
			int b = scan.nextInt();
			long c = scan.nextInt();
			Arrays.sort(a);
			for(int j=0; j<b; j++) {
				if(a[j]<c) {
					a[j]=c;
				}
			}
		}
		scan.close();
		long sum = 0;
		for (int i =0; i<n; i++) {
			 sum += a[i];
		}
		System.out.println(sum);
	}
}