
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//入力データを変数で受け取る
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<>();

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(set.contains(num)) {
				set.remove(num);
			} else {
				set.add(num);
			}
		}

		System.out.println(set.size());
		//入力データを処理して、結果を出力


	}
}
