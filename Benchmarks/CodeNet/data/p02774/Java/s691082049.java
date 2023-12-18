import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();

		//入力された数字を格納するリスト
		List<Integer>list = new ArrayList<>();
		//積を格納するリスト
		List<Integer>sekiList = new ArrayList<>();

		//最初の０番目はループ前に追加
		int A = scan.nextInt();
		list.add(A);

		//N-1回分のループ
		for(int i=1;i<N;i++) {
			int K1 = scan.nextInt();
			for(int num:list) {
				sekiList.add(num*K1);
			}
			list.add(K1);
		}

		Collections.sort(sekiList);
		System.out.println(sekiList.get(K-1));
	}

}