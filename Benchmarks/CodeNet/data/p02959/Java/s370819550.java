import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n+1];
		long[] b=new long[n];
		long sum=0;

		for(int i=0;i<=n;i++) a[i]=sc.nextLong();

		for(int i=0;i<n;i++) b[i]=sc.nextLong();

		for(int i=n-1;i>=0;i--) {
			sum+=Math.min(a[i+1], b[i]);
			b[i]=Math.max(0, b[i]-a[i+1]);
			sum+=Math.min(a[i], b[i]);
			a[i]=Math.max(0, a[i]-b[i]);
		}
		System.out.println(sum);
	}
}

