import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		//1行目を取得
		int n = scan.nextInt();

		ArrayList<Integer> nn = new ArrayList<>();
		int count = 1;

		while(count <= n) {
			//2行目を取得
			nn.add(scan.nextInt());
			count = count + 1;
		}

		int count2 = 0;
		int count3 = nn.size();

		while(count3 >= 3) {
			//3枚の数を退避
			int left = nn.get(count2);
			int center = nn.get(count2 + 1);
			int right = nn.get(count2 + 2);
			//center + left
			int centerleft = center + left;
			//center + right
			int centerright = center + right;
			//足した数を格納する
			nn.add(count2, centerleft);
			nn.add(count2+2, centerright);
			//centerを削除
			nn.remove(count2 + 1);
			count3 = count3 - 1;
		}
//		足した数を出力する
		System.out.println(nn.get(0) + nn.get(1));

	}

}
