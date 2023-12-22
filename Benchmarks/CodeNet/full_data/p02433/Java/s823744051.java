import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Integer> list = new LinkedList<Integer>();
		ListIterator<Integer> iterator = list.listIterator();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i = 0; i < n; i++){
			int query = sc.nextInt();

			switch(query){
				case 0:
					iterator.add(sc.nextInt());
					iterator.previous();  //LinkedListなのでカーソルを前に移動
					break;

				case 1:
					int d = sc.nextInt();
					if(d > 0){
						for(int j = 0; j < d; j++) iterator.next();
					}
					else{
						for(int j = 0; j > d; j--) iterator.previous();
					}
					break;

				case 2:
					iterator.next();  //イテレータの初期位置が削除したい要素の前にある為
					iterator.remove();
					break;
			}
		}
		for(int num : list) {  //拡張forループ
			System.out.println(num);
		}
	}

}
