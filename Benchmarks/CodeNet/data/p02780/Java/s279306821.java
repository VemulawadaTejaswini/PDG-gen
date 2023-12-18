import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long sum[] = new long[200005];
		int p[] = new int[200005];

		long r[] = new long[1001];
		for(int i=1; i<=1000; i++) {
			r[i]=r[i-1]+i;
		}
		sum[0]=0;
		for(int i=0; i<n; i++) {
			p[i] = sc.nextInt();
			sum[i+1] = sum[i]+p[i];
		}
		long max = 0;
		int maxi = 0;
		for(int i=0; i<n-k+1; i++) {
			long tmp = sum[i+k] - sum[i];
			if(max<tmp) {
				max=tmp;
				maxi=i;
			}
		}
		double e = 0;
		for(int i=0; i<k; i++) {
			e+=(double)r[p[i+maxi]]/(double)p[i+maxi];
		}
		System.out.println(e);

		sc.close();
	}
}
