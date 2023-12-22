import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int s[];
		int t;
		double m;
		double sd;

		while (true){
			n = sc.nextInt();
			if (n == 0){
				break;
			}

			s = new int[n];
			t = 0;
			m = 0.0;
			sd = 0.0;

			/* 合計、相加平均 */
			for (int i = 0; i < n; i++){
				s[i] = sc.nextInt();
				t += s[i];
			}
			m = 1.0 * t / n;

			/* 標準偏差 */
			for (int i = 0; i < n; i++){
				sd += (s[i] - m) * (s[i] - m);
			}
			sd /= n;
			sd = Math.sqrt(sd);

			System.out.printf("%.5f%n", sd);
		}

	}
}