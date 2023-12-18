
import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		boolean ans = true;
		if (n%3==0) {
			
			
			for (int i=0;i<n/3;i++) {
				if (a[i]!=a[0]) {
					ans = false;
				}
			}
			for (int i=n/3;i<n*2/3;i++) {
				if (a[i]!=a[n/3]) {
					ans = false;
				}
			}
			for (int i=n*2/3;i<n;i++) {
				if (a[i]!=a[n*2/3]) {
					ans = false;
				}
			}
			if ((a[0]^a[n/3]) != a[n*2/3]) {
				ans=false;
			}
						
		} else {
			
			for (int i=0;i<n;i++) {
				if(a[i]!=0) {
					ans=false;
				}
			}
		}
		System.out.println(ans ? "Yes" : "No");
	}


}