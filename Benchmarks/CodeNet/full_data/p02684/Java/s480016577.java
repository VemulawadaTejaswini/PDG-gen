import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		Map<Integer,Integer> map = new HashMap<>();
		//カギは町番号

		for(int i = 1; i <= N; i++) {
			map.put(i,sc.nextInt());
		}

		int teleport = 1;
		int town = 1;

		for(int i = 1; i <= K; i++) {
			teleport = map.get(town);
			town = teleport;
		}

		System.out.println(town);
	}

}
