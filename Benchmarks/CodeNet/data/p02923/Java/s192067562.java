import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.nextLine());
		int[] H = Arrays.stream(sc.nextLine().split(" ")).mapToInt(r -> Integer.parseInt(r)).toArray();

		int max_cnt = 0;
		for (int i = 0; i < H.length - 1; i++) {
			int cnt = 0;
			for (int j = i; j < H.length - 1; j++) {
				if (H[j] >= H[j + 1]) {
					cnt++;
				}
				else {
					break;
				}
			}
			max_cnt = Math.max(max_cnt, cnt);
		}
		System.out.println(max_cnt);
	}
}