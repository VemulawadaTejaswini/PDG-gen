import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n + 1];
		int[] y = new int[n + 1];
		for(int i = 0 ; i < n ; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double sum = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = i + 1 ; j < n ; j++) {
				double disX = x[i] - x[j];
				double disY = y[i] - y[j];
				double dis_dis = disX * disX + disY * disY;
				sum += Math.sqrt(dis_dis);
			}
		}
		System.out.println(sum * 2 / (double)n );

	}
}

