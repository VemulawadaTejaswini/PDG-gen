import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Integer> okashiList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			okashiList.add(0);
		}

		//お菓子の種類だけ繰り返す
		for(int i = 0; i < K; i++) {
			//お菓子の個数の取得
			int d = sc.nextInt();
			for(int j = 0;j < d;j++) {
				int Ad = sc.nextInt();
				okashiList.set(Ad-1, 10);
			}
		}

		int answer = 0;
		for(int x = 0;x < okashiList.size();x++){
			if(okashiList.get(x) == 0) {
				answer ++ ;
			}
		}

		System.out.println(answer);

	}

}
