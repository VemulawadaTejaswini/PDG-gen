import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		//箱を作成
		HashSet<Integer> set = new HashSet<>();
		
		//箱に追加する
		for (int i = 0; i < N; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set.size() < N ? "No" : "Yes");
	}
}
