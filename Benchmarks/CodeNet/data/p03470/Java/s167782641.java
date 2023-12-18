import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		int n = sc.nextInt();
		for (int i = 0; i < n; i ++ ) {
			map.put(sc.nextInt(), true);
		}

		System.out.println(map.size());
	}

}
