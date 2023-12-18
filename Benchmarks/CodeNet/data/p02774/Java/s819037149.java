import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
		}
		sc.close();
		long[] r = new long[(n*(n-1))/2];
		int c = 0;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				r[c] = a[i]*a[j];
				c++;
			}
		}
		Arrays.sort(r);
		System.out.println(r[k-1]);
	}
}
