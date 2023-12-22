
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力しながら答えを出してしまおう…配列面倒なので
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());

		int result = 0;
		for (int i = 1; i <= n; i++) {
			int x = Integer.parseInt(sc.next());
			if (x % 2 == 1 && i % 2 == 1) {
				result++;
			}
		}

		System.out.println(result);
	}
}