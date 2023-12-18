
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		//入力データを処理して、結果を出力
		int sum = 0;
		for(int i : list) {
			sum += i;
		}

		if(sum % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}

