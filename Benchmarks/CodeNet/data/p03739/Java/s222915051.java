import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		double count = 0;
		double sum = 0, presum;
		
		n = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
		
		sc.close();
		
		presum = -1.0 * a[0];
		
		for(int i: a) {
			sum += (double)i;
			if(sum * presum > 0) {
				double tmp = Math.abs(sum) + 1;
				if(presum > 0)sum -= tmp;
				else sum += tmp;
				count += tmp;
			}
			
			if(sum == 0) {
				if(presum > 0)sum--;
				else sum++;
				++count;
			}
			
			presum = sum;
		}
		
		System.out.printf("%.0f\n", count);
	}

}
