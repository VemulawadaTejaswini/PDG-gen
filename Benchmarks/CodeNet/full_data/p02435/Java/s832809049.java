import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();

		//Deque型のListを生成
		List<Deque<Integer>> list = new ArrayList<Deque<Integer>>();
		for(int i = 0; i < n; i++) {
			list.add(new ArrayDeque<Integer>());
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
				if(!(list.get(t).isEmpty())) {
					System.out.println(list.get(t).peekLast());
				}
				break;

			case 2:
				list.get(t).pollLast();
				break;
			}
		}
	}

}

