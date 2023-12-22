import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = Integer.parseInt(sc.nextLine());
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		long ans = 1;
		long lev = 1000000000000000000L;
		boolean zeroFlg = false;
		for (int i = 0; i < line.length; i++) {
			if (line[i] == 0) {
				zeroFlg = true;
			}
		}

		if (zeroFlg == false) {
			for (int i = 0; i < line.length; i++) {
				if (line[i] <= lev / ans) {
					ans *= line[i];
				}else {
					ans = -1;
					break;
				}
			}
			System.out.println(ans);
		}else {
			System.out.println(0);
		}

	}
}
