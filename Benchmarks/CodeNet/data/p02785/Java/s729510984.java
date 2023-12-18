import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);

		// モンスター数
		int n = sc.nextInt();
		// 必殺技使用限度数
		int k = sc.nextInt();
		// モンスター一覧
		List<Long> longList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			longList.add(sc.nextLong());
		}
		Collections.sort(longList);
		if (k >= n) {
			k = n;
		}
		int cnt = 0;
		for (int j = longList.size()-1 ; cnt < k ; j--) {
			longList.remove(j);
			cnt++;
		}
		long result = 0;
		for (long a : longList) {
			result = result + a;
		}

		System.out.println(result);

	}

}