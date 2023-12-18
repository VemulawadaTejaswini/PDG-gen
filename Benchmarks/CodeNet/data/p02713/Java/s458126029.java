import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 0;
		int tmpRest = 0;
		int tmpMax = 0;
		int num1;
		int num2;

		for (int c = 1; c <= X; c++) {
			for (int d = 1; d <= X; d++) {
				for (int e = 1; e <= X; e++) {
					if (c >= d) {
						num1 = c;
						num2 = d;
					} else {
						num1 = d;
						num2 = c;
					}
					while ((tmpRest = num1 % num2) != 0) {
						num1 = num2;
						num2 = tmpRest;
					}
					tmpMax = num2;

					if (tmpMax >= e) {
						num1 = tmpMax;
						num2 = e;
					} else {
						num1 = e;
						num2 = tmpMax;
					}
					while ((tmpRest = num1 % num2) != 0) {
						num1 = num2;
						num2 = tmpRest;
					}
					ans = ans + num2;

				}
			}
		}
		System.out.println(ans);
	}
}
