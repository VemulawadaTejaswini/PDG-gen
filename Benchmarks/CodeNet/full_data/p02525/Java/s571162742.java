import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			double ave = 0, var = 0;
			int n = sc.nextInt();
			if (n == 0) {break;}
			int[] point = new int[n];
			for (int i = 0; i < point.length; i++) {
				point[i] = sc.nextInt();
				ave = ave + point[i];
			}
			ave = ave / point.length;
			for (int i = 0; i < point.length; i5
				++) {
				var = var + (point[i] - ave) * (point[i] - ave);
			}
			var = var / point.length;
			System.out.println(Math.sqrt(var));
		}
	}
}