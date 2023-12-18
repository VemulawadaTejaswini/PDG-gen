import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] in = new double[n];
		
		int ans = 0;
		for (int i=0; i<n; i++) {
			in[i] = sc.nextInt();
		}

		Arrays.sort(in);
		double average = Math.ceil((in[0] + in[n-1]) / 2);
//		System.out.println(average);
		for (int j=0; j<n; j++) {
			ans += (in[j] - average) * (in[j] - average);
		}

		System.out.println(ans);
		sc.close();
	}

}
