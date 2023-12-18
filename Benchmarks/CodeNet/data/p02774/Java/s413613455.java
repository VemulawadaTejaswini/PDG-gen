import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] a = new long[n];
		long[] s = new long[n*(n-1)/2];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextLong();
		}
		int p=0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				s[p] = a[i]*a[j];
				p++;
			}
		}
		Arrays.sort(s);
		
		System.out.println(s[k-1]);
		
	}

}
