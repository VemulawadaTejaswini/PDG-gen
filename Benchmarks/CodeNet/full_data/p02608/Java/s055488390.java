import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(0);
		}
		for (int x = 1; x < Math.sqrt(n); x++) {
			for (int y = 1; y < Math.sqrt(n); y++) {
				for (int z = 1; z < Math.sqrt(n); z++) {
					if (cal(x, y, z) <= n + 1) {
//						System.out.println(cal(x, y, z));
//						System.out.println(list.get(cal(x, y, z)));
//						System.out.println(list.get(cal(x, y, z)) - 1);
						list.set(cal(x, y, z) - 1, list.get(cal(x, y, z) - 1) + 1);
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(list.get(i));
		}
	}

	public static int cal(int x, int y, int z) {
		return (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
	}
}
