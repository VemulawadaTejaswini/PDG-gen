import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long c=sc.nextLong();
		long x[] = new long[n];
		long v[] = new long[n];
		for(int i=0; i<n; i++) {
			x[i]=sc.nextLong();
			v[i]=sc.nextLong();
		}

		long left[]=new long[n+1];
		long leftback[] = new long[n+1];
		long lsum=0;
		for(int i=0; i<n; i++) {
			left[i+1]= Math.max(left[i], lsum+v[n-1-i]-(c-x[n-1-i])) ;
			leftback[i+1]= Math.max(leftback[i], lsum+v[n-1-i]-2*(c-x[n-1-i])) ;
			lsum += v[n-1-i];
		}

		long right[]=new long[n+1];
		long rightback[]=new long[n+1];
		long rsum=0;
		for(int i=0; i<n; i++) {
			right[i+1]= Math.max(right[i],rsum+v[i]-x[i]) ;
			rightback[i+1]= Math.max(rightback[i], rsum+v[i]-2*x[i]) ;
			rsum += v[i];
		}

		long max = 0;
		for(int i=0; i<=n; i++) {
			max = Math.max(max, Math.max(leftback[i]+right[n-i], rightback[i]+left[n-i])) ;
		}
		System.out.println(max);
		sc.close();
	}
}
