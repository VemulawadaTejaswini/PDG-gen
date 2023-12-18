import java.util.Scanner;

public class Main {
	static int gcd(int m, int n) {
		int temp=0;
		while((temp=m%n)!=0) {
			m=n;
			n=temp;
		}
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		int[] A = new int[n];
		int[] left = new int[n];
		int[] right = new int[n];
		for (i = 0; i < n; i++) {
			A[i]=sc.nextInt();
		}
		int ans=0;
		left[0]=0;
		for(i=1;i<n;i++) {
			left[i]=gcd(left[i-1],A[i-1]);
		}
		right[n-1]=0;
		for(i=n-2;i>=0;i--) {
			right[i]=gcd(right[i+1],A[i+1]);
		}
		for(i=0;i<n;i++) {
			ans=Math.max(ans, gcd(left[i],right[i]));
		}
		
		System.out.println(ans);
	}
}