import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while((n = sc.nextInt()) != 0){
			int sum = 0;
			int[] point = new int[n];
			for(int i = 0; i < n; i++){
				point[i] = sc.nextInt();
				sum += point[i];
			}
			double ave = (sum + 0d) / n;

			double sum2 = 0;
			for(int i = 0; i < n; i++){
				sum2 += Math.pow(point[i] - ave, 2);
			}
			double std = Math.sqrt(sum2 / n);

			System.out.println(std);
		}
		sc.close();
	}
}