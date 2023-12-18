import java.util.Scanner;

public class Main {
	public static int gcd(int a, int b) {
		int tmp;
		while(b!=0) {
			tmp=b;
			b=a%b;
			a=tmp;
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int[] preGCD = new int[n+1];
		preGCD[0]=0;
		int[] postGCD = new int[n+1];
		postGCD[0]=0;
		for(int i=0, tmp=a[0]; i<n; i++) {
			tmp=gcd(tmp, a[i]);
			preGCD[i] = tmp;
//			System.out.println(preGCD[i]);
		}
		for(int i=0, tmp=a[n-1]; i<n; i++) {
			tmp=gcd(tmp, a[n-1-i]);
			postGCD[n-1-i] = tmp;
//			System.out.println(postGCD[n-1-i]);
		}
		int ans=Math.max(preGCD[n-2], postGCD[1]);
		for(int i=0+1, tmp; i<n-1; i++) {
			tmp=gcd(preGCD[i-1], postGCD[i+1]);
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}