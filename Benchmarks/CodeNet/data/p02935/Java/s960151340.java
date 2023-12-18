import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); double[] v = new double[n];
		for(int i = 0; i< n; i++) {
			v[i] = sc.nextDouble();
		}
		Arrays.parallelSort(v);
		double value = (v[0] + v[1])/2;
		for(int i = 1; i < n-1; i++) {
			value = (value + v[i+1])/2;
		}
		System.out.println(value);
		sc.close();
	}
}