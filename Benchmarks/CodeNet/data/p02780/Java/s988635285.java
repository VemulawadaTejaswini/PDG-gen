import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		double max = 0;
		double p[] = new double[n];
		for(int i=0;i<n;i++) {
			int h = scan.nextInt();
			p[i] = (0.5*h*(h+1))/h;
		}

		for(int i=0;i<=n-k;i++) {
			double sum = 0;
			for(int j=i;j<i+k;j++) {
				sum += p[j];
			}
			max = Math.max(sum, max);
		}

		System.out.println(max);

	}

}
