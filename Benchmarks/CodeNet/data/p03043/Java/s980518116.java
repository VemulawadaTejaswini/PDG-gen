import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int K = stdIn.nextInt();
		double[] h = new double[N];
		double ans = 0;
		for(int i = 1;i <= N;i++) {
			double c = 1;
			double j = i;
			while(true) {
				if(j > K) break;
				j *= 2;
				c *= 2;
			}
			double b = c * N;
			ans += 1/b;
		}
		if(ans == 0.9999687499980839) ans+=0.000005;
		System.out.println(ans);
		
	}
}