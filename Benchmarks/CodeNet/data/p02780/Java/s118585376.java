import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] ary = new int[n];
		for(int i=0; i<n; i++){
			ary[i] = sc.nextInt();
		}

		double[] result = new double[n];
		for(int i=0; i<n; i++){
			result[i] = (ary[i] * (1 + ary[i])) / (2.0 * ary[i]);
		}

		double maxTotal = 0;
		for(int i=0; i<k; i++) {
			maxTotal = maxTotal + result[i];
		}
		double nowTotal = maxTotal;
		int count = 0;
		for(int i=k; i<n; i++){
			double total = nowTotal + result[i] - result[count];
			maxTotal = Math.max(maxTotal, total);
			nowTotal = total;
			++count;
		}
		System.out.println(maxTotal);
	}
}
