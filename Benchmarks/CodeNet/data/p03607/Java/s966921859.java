
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
			int num = sc.nextInt();
			if(list.contains(num)) {
				int index = list.indexOf(num);
				list.remove(index);
			} else {
				list.add(num);
			}
		}

		System.out.println(list.size());

		//入力データを処理して、結果を出力


	}
}
