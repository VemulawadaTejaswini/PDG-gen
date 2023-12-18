import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long[] AandB = new long[n];
		long ans = 0;
		for(int i=0;i<n;i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			ans += a;
			AandB[i] = a+b;
		}
		Arrays.sort(AandB);
		for(int i=n-2;i>=0;i-=2) {
			ans -= AandB[i];
		}
		System.out.println(ans);
		in.close();
	}

}
