import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		long h[]=new long[N];
		for(int i=0;i<N;i++) {
			h[i]=in.nextLong();
		}
		Arrays.sort(h);
		long max=1000000001;
		for(int i=0;i<N-K+1;i++) {
			max=Math.min(max,h[i+K-1]-h[i]);
		}
		System.out.println(max);

	}
}
