import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int x = Integer.parseInt(sa[1]);
		br.close();

		if (x == 1 || x == 2 * n - 1) {
			System.out.println("No");
			return;
		}
		System.out.println("Yes");

		if (n == 2) {
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			return;
		}

		int[] center = {x - 2, x + 1, x, x - 1};
		int min = x - 2;
		if (x == 2) {
			center[0] = x + 2;
			center[1] = x - 1;
			center[3] = x + 1;
			min = x - 1;
		}
		int num = 0;
		for (int i = 0; i < n - 3; i++) {
			num++;
			if (num == min) {
				num += 4;
			}
			System.out.println(num);
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(center[i]);
		}
		for (int i = 0; i < n - 2; i++) {
			num++;
			if (num == min) {
				num += 4;
			}
			System.out.println(num);
		}
	}
}
