import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String tmp[] = scan.nextLine().split(",");
			int[] l = new int[10];
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(tmp[i]);
				sum += l[i];
			}
		
			//System.out.println(Arrays.toString(l));
			int v1 = Integer.parseInt(tmp[10]);
			int v2 = Integer.parseInt(tmp[11]);

			/* x = v1 * t , x = -v2*t + sum */
			double dist = v1 * sum / (double) (v1 + v2);
			int passed = 0;
			int ans = 0;
			for (int i = 0; i < 10; i++) {
				passed += l[i];
				if (passed >= dist) {
					ans = i + 1;
					break;
				}
			}

			System.out.println(ans);
		}
	}

}