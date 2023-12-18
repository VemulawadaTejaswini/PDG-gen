import java.util.*;
// warm-up
// Much cleaner i guess. Not sure why the previous solution (without any extra memory) failed. No way to know the test cases.
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int t=0, i=0, n=sc.nextInt(), k=sc.nextInt(), tot=n, max=Integer.MIN_VALUE;
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		while (tot-->0) a[i++] = sc.nextInt();
		i=0; b[i]=a[i];
		for (i=1; i<n; i++) b[i] = Math.min(b[i-1],a[i]);
		for (i=0; i<n; i++) {
			c[i] = a[i]-b[i];
			if (c[i]>max) max=c[i];
		}
		for (int d : c) if (d==max) t++;
		System.out.println(t);
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}