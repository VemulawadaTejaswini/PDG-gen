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


		for(int i=0;i<N;i++) {
			int A = scan.nextInt();
			list.add(A);
		}

		for(int i=0;i<N;i++) {
			for(int n=N-1;n>i;n--) {
				sekiList.add(list.get(i)*list.get(n));
			}
		}

		Collections.sort(sekiList);
	
		System.out.println(sekiList.get(K-1));
	}

}