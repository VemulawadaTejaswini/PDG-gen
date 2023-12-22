import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int spaceNum = sc.nextInt();
		int dollTypeNum = sc.nextInt();
		int space[] = new int[spaceNum];
		int dollType[] = new int[dollTypeNum];  //添え字に注意
		int cursor = 0;
		int count = 0;

		for(int i = 0; i < spaceNum; i++) {
			space[i] = sc.nextInt();
			for(int j = 1; j <= dollTypeNum; j++) {
				if(space[i] == j) {
					dollType[j - 1]++;
					break;
				}
			}
		}

		List<Integer> typeList= new ArrayList<Integer>();
		for(int i = 0; i < dollTypeNum; i++) {
			typeList.add(i + 1);
		}

		for(int i = 0; i < dollTypeNum; i++) {
			FillIn fi = new FillIn();
			fi.fill_in(cursor, space, typeList, dollType);
			cursor += dollType[fi.getNum() - 1];
			count += fi.getMin();

			Iterator<Integer> iter = typeList.iterator();
			while(iter.hasNext()) {
				int type = iter.next();
				if(type == fi.getNum()) iter.remove();  //getした値を変数に入れてもいいかも
				break;
			}
		}

		System.out.println(count);
	}
}

class FillIn {
	int num = 0;
	int min = Integer.MAX_VALUE;
	//最小の操作回数で埋められるぬいぐるみ番号を探すメソッド
	//fill_in_in_order(埋める開始点, 操作前のぬいぐるみ配列, 埋め終わってないぬいぐるみ番号を入れたリスト, ぬいぐるみ番号別の個数を入れた配列);
	public void fill_in(int start, int[] array, List<Integer> list, int[] type) {
		int cursor;
		int count = 0;
		for(int i = 0; i < list.size(); i++) {  //埋め終わってないぬいぐるみ番号のループ
			cursor = start;
			count = 0;
			for(int j = 0; j < type[list.get(i) - 1]; j++) {  //その番号のぬいぐるみの個数のループ
				if(array[cursor] == list.get(i)) count++;  //cursor = jでもいいかも
				cursor++;
			}
			if(type[list.get(i) - 1] - count < min) {
				num = list.get(i);
				min = type[num - 1] - count;
			}
		}
	}

	public int getNum() {
		return this.num;
	}

	public int getMin() {
		return this.min;
	}
}
