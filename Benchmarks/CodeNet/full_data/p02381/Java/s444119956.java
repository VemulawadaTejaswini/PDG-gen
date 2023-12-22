
//import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0, j = 0, sum = 0, n = 0;
		double a, m, v = 0.0;
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			int[] scores = new int[n];
			for (i = 0; i < scores.length; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}
			m = (double) sum / (double) n;
			for (j = 1; j < n; j++) {
				v += Math.pow(scores[j] - m, 2);
			}
			v /= n;
			a = Math.sqrt(v);
			System.out.printf("%f\n", a);
		}
	}
}