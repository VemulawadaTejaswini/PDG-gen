import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long c = in.nextLong();
		long[] x = new long[n];
		long[] v = new long[n];
		for(int i=0;i<n;i++) {
			x[i] = in.nextLong();
			v[i] = in.nextLong();
		}
		long[] sum1 = new long[n];
		sum1[0] = v[0] - x[0];
		long max1 = sum1[0];
		for(int i=1;i<n;i++) {
			sum1[i] = sum1[i-1] + v[i] - x[i] + x[i-1];
			if(max1<sum1[i]) max1 = sum1[i];
		}
		
		long[] sum2 = new long[n];
		sum2[0] = v[n-1] - c + x[n-1];
		long max2 = sum2[0];
		for(int i=1;i<n;i++) {
			sum2[i] = sum2[i-1] + v[n-1-i] - x[n-i] + x[n-1-i];
			if(max2<sum2[i]) max2 = sum2[i];
		}
		
		int r=0;
		int l=0;
		long max3 = sum1[r] + sum2[l] - Math.min(x[r], c - x[n-1-l]);
		for(r=0;r<n;r++) {
			for(l=0;l+r<n-2;l++) {
				if(max3<sum1[r] + sum2[l] - Math.min(x[r], c - x[n-1-l])) {
					max3 = sum1[r] + sum2[l] - Math.min(x[r], c - x[n-1-l]);
				}
			}
		}
		
		System.out.println(Math.max(Math.max(max1, max2), Math.max(max3, 0)));
		
		in.close();
		

	}

}
