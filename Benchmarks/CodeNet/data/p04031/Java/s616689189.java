import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] list = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
			sum += list[i];
		}
		double avg = (double) sum / n;
		int avg2 = (int) Math.round(avg);
		int cst = 0;
		for (int i = 0; i < n; i++) {
			cst += Math.pow(list[i] - avg2, 2);
		}
		System.out.println(cst);
	}

}
