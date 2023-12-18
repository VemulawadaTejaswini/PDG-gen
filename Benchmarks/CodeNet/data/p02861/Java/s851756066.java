
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double sum = 0;
		for(int i = 0; i < n; i++){
			for(int k = i + 1; k < n; k++){
				sum += Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]));
			}
		}
		// avg * (n - 1)
		System.out.println(sum / n * 2);
	}
}
