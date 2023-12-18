import java.util.Scanner;

public class Main {
	
	public static double sequence(int a[], double start) {
		double count = 0.0, presum = -1.0 * start, sum = 0.0;
		
		for(int i = 0; i < a.length; ++i) {
			sum += (double)a[i];
			if(i == 0)sum = start;
			if(sum * presum > 0) {
				double min = Math.abs(sum) + 1;
				if(presum > 0)sum -= min;
				else sum += min;
				count += min;
			}
			
			if(sum == 0) {
				if(presum > 0)sum--;
				else sum++;
				++count;
			}
			
			presum = sum;
		}
		
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		double count = 0.0, tmp2 = 0.0, tmp3 = 0.0;
		
		n = sc.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; ++i) a[i] = sc.nextInt();
		
		sc.close();
		
		
		if(a[0] == 0) {
			a[0]++;
			++tmp3;
		}
		
		int tmp = Math.abs(a[0]) + 1;
		
		if(a[0] > 0) {
			tmp2 = tmp + tmp3;
			tmp = a[0] - tmp;
		}
		else { 
			tmp2 = tmp + tmp3;
			tmp = a[0] + tmp;
		}
		
		count = Math.min((tmp3 + sequence(a, (double)a[0])),(tmp2 + sequence(a, (double)tmp)));
		
		System.out.printf("%.0f\n", count);
	}

}
