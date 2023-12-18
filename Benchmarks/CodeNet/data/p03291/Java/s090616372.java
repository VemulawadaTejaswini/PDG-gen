import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long div = 1000000007;
		int n = s.length();
		int[] a = new int[n];
		boolean[] b = new boolean[n];
		int[] c = new int[n];
		int[] q = new int[n];
		char ch = s.charAt(0);
		if(ch=='A') a[0]++;
		else if(ch=='B') b[0] = true;
		else if(ch=='C') c[0]++;
		else q[0]++;
		for(int i=1;i<n;i++) {
			ch = s.charAt(i);
			a[i] = a[i-1];
			c[i] = c[i-1];
			q[i] = q[i-1];
			if(ch=='A') a[i]++;
			else if(ch=='B') b[i] = true;
			else if(ch=='C') c[i]++;
			else {
				b[i] = true;
				q[i]++;
			}
		}
		long[] threePow = new long[n];
		threePow[0] = 0;
		threePow[1] = 1;
		for(int i=2;i<n;i++) {
			threePow[i] = (threePow[i-1]*3)%div;
		}
		
		long ans = 0;
		for(int i=1;i<n-1;i++) {
			if(b[i]) {
				ans += ((threePow[q[i-1]+1]*a[i-1]+threePow[q[i-1]]*q[i-1])) * (threePow[q[n-1]-q[i]+1]*(c[n-1]-c[i])+threePow[q[n-1]-q[i]]*(q[n-1]-q[i]))%div;
			}
			if(ans>div) ans %= div;
		}
		
		System.out.println(ans);
	}

}
