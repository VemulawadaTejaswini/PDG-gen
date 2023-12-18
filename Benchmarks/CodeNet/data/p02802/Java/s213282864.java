import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// 集計用の変数
		Set<Integer> ACset = new HashSet<>();
		int WAcount = 0;
		for (int i = 0; i < M; i++) {
			int pi = sc.nextInt();
			String Si = sc.next();
			if (Si.equals("AC")) {
				ACset.add(pi);
			}
			else if (!ACset.contains(pi)){
				WAcount++;
			}
		}
		
		// 結果の出力
		System.out.println(ACset.size() + " " + WAcount);

		sc.close();
	}
}
