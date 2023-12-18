import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		double max = 0.0;
		int maxAll = 0;
		int maxSugar = 0;
		for (int ax = 0; ax * a * 100 <= f; ax++) {
			for (int bx = 0; ax * a * 100 + bx * b * 100 <= f; bx++) {
				for (int cx = 0; ax * a * 100 + bx * b * 100 + cx * c <= f; cx++) {
					for (int dx = 0; ax * a * 100 + bx * b * 100 + cx * c + dx * d <= f; dx++) {
						if ((ax * a + bx * b) * e < cx * c + dx * d) {
							continue;
						}
						double v = (double)(cx * c + dx * d) / (double)(ax * a * 100 + bx * b * 100 + cx * c + dx * d);
						if (max < v) {
							max = v;
							maxAll = ax * a * 100 + bx * b * 100 + cx * c + dx * d;
							maxSugar = cx * c + dx * d;
						}
					}
				}
			}
		}
		System.out.println(maxAll + " " + maxSugar);
	}
}
