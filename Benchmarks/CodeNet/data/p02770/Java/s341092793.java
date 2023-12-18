import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int q = sc.nextInt();
		long[] d = new long[k];
		for(int i=0; i<k; i++)
			d[i] = sc.nextLong();

		long[] d2 = new long[k];
		for(int i=0; i<q; i++) {
			long n = sc.nextLong();
			long x = sc.nextLong();
			long m = sc.nextLong();
			
			x = x % m;
			for(int j=0; j<k; j++)
				d2[j] = d[j] % m;
			
			long sum = x;

			long cycle = 0;
			int cycleEqual = 0;
			for(int j=0; j<k; j++) {
				cycle += d2[j];
				if(d2[j]==0)
					cycleEqual++;
			}
			sum += cycle*((n-1)/k);
			
			int leftEqual = 0;
			for(int j=0; j<(n-1)%k; j++) {
				sum += d2[j];
				cycle += d2[j];
				if(d2[j]==0)
					leftEqual++;
			}

			long ans = n-1 - (sum/m);
			ans -= cycleEqual * ((n-1)/k);
			ans -= leftEqual;

			System.out.println(ans);
		}
		sc.close();
	}
	
}
