import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int k = scan.nextInt();
		double max = 0;
		double sum = 0;
		double p[] = new double[n];
		for(int i=0;i<n;i++) {
			int h = scan.nextInt();
			p[i] = (0.5*h*(h+1))/h;
			sum += p[i];

			if(i >= k) {
				sum -= p[i-k];
			}

			max = Math.max(max,sum);
		}


		System.out.println(max);

	}

}
