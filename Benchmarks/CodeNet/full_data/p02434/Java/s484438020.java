import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();

		//listの配列を作りたい
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
		}

		for(int i = 0; i < q; i++)	{
			int query = sc.nextInt();
			int t = sc.nextInt();

			switch(query){
			case 0:
				int x = sc.nextInt();
				list.get(t).add(x);  //listの中のt番目の要素を取得し、それにaddする
				break;

			case 1:
				for(int j = 0; j < list.get(t).size(); j++) {
					if(j != 0) System.out.print(" ");
					System.out.print(list.get(t).get(j));
				}
				System.out.println();
				break;

			case 2:
				list.get(t).clear();
				break;
		}

		}
	}

}

