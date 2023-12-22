import java.util.Scanner;

//listを配列に変更したバージョン

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int spaceNum = sc.nextInt();
		int dollTypeNum = sc.nextInt();
		int space[] = new int[spaceNum];  //棚の初期状態
		int dollType[] = new int[dollTypeNum];  //ぬいぐるみが種類ごとにいくつあるか(添え字に注意)
		int cursor = 0;
		int count = 0;

		int flag[] = new int[dollTypeNum];  //ぬいぐるみの種類ごとに使用したかどうかを判定するフラグ

		for(int i = 0; i < spaceNum; i++) {
			space[i] = sc.nextInt();
			for(int j = 1; j <= dollTypeNum; j++) {
				if(space[i] == j) {
					dollType[j - 1]++;
					break;
				}
			}
		}
		////////////////////////////////////////////////////////////////////ここまではOK

		for(int i = 0; i < dollTypeNum; i++) {
			FillIn2 fi = new FillIn2();
			fi.fill_in(cursor, space, flag, dollType);
			cursor += dollType[fi.getNum() - 1];
			count += fi.getMin();

			flag[fi.getNum() - 1] = 1;
		}

		System.out.println(count);
	}
}

class FillIn2 {
	private int num = 0;
	private float ratio = -1;
	private int time = 0;  //求める操作回数を入れる変数
	//(埋められるまでの操作回数)÷(その番号のぬいぐるみの個数)の割合が低いものから埋めていく
	/*  fill_in(埋める開始点, 操作前のぬいぐるみ配列, 埋め終わってないぬいぐるみ番号を判別するフラグ列,
	ぬいぐるみ番号別の個数を入れた配列);  */
	public void fill_in(int start, int[] array, int[] flag, int[] type) {
		int cursor;
		int count = 0;
		for(int i = 0; i < flag.length; i++) {  //埋め終わってないぬいぐるみ番号のループ
			cursor = start;
			count = 0;
			if(flag[i] == 0) {
				for(int j = 0; j < type[i]; j++) {  //その番号のぬいぐるみの個数のループ
					//System.out.println(j + " " + cursor);

					if(array[cursor] == i + 1) count++;
					cursor++;
				}
				//System.out.println("count:" + count + " ratio:" + (float)(count) / (float)(type[i]));
				if((float)(count) / (float)(type[i]) > ratio) {
					//iのforループを回してここで求めたnumがぬいぐるみ番号、minがその操作回数
					num = i + 1;
					time = type[i] - count;
					ratio = (float)(count) / (float)(type[i]);
				}
			}
		}
		//System.out.println("num:" + num);
		//System.out.println();
	}


	public int getNum() {
		return this.num;
	}

	public int getMin() {
		return this.time;
	}

}

