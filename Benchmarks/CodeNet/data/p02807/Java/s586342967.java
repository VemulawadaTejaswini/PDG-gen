import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long x[] = new long[n];
		for(int i=0;i<n;i++) {
			x[i]=scan.nextLong();
		}
		scan.close();
		long n_1=1;
		double ex=0;
		for(int i=0;i<n-1;i++) {
			double y=0;
			y+=x[n-1]-x[i];
			if(i!=0) {
				y+=x[n-1]-x[0];
			}
			ex+=(double)y/(n-1);
			if(i!=0)n_1*=(i+1);
		}
		ex=(ex*n_1)%1000000007;
		System.out.println((int)ex);
	}
}