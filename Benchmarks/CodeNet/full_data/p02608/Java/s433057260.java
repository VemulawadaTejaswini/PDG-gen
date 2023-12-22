import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int Y = 1;
		int Z = 1;
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int x = 1;; x++) {
				if (cal(x, Y, Z) > i) {
					break;
				}
				for (int y = 1;; y++) {
					if (cal(x, y, Z) > i) {
						break;
					}
					for (int z = 1;; z++) {
						if (cal(x, y, z) > i) {
							break;
						} else if (cal(x, y, z) == i) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

	public static int cal(int x, int y, int z) {
		return (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
	}

}
