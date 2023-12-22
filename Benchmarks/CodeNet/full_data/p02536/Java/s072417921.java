import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		//整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = 0;

		List<List<Integer>> ab = new ArrayList<List<Integer>>();

		for(int i=0; i<m; i++) {
			List<Integer> abComp = new ArrayList<Integer>();
			abComp.add(sc.nextInt());
			abComp.add(sc.nextInt());
			ab.add(abComp);
		}

		for(int i=1; i<=n; i++) {
			int x = 0;
			for(int j=0; j<m; j++) {
				if(ab.get(j).get(0) == i || ab.get(j).get(1) == i) {
					x = 1;
				}
			}
			if(x == 0) {
				answer += 1;
			}
		}

		if( m+answer < n-1) {
			answer = n-m-1;
		}
		System.out.println(answer);
	}
}