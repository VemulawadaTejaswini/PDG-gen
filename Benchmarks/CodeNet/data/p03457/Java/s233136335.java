import java.util.ArrayList;
import java.util.Scanner;

class location {
	int x;
	int y;
	int ti;

	public location(int x, int y, int ti) {
		this.x = x;
		this.y = y;
		this.ti = ti;
	}

	public void print_member_value() {
		System.out.println("ti:" + String.valueOf(this.ti) +",x:" + String.valueOf(this.x) + ", y:" + String.valueOf(this.y) );

	}

}


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//input
		//	総step数N
		//	時刻tにおける位置(xi,yi)

		Scanner scan = new Scanner(System.in);
		ArrayList<location> points =  new ArrayList<location>();
		int N = scan.nextInt();

		location start_point = new location(0,0,0);
		points.add(start_point);

		for(int i = 0; i < N ; i ++) {
			int ti= scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();

			location point = new location(x,y,ti);
			//point.print_member_value();
			points.add(point);

		}

		//logic
		//★①
		//		A.xiからxi+1へ行くには最低何step必要か求める
		//		B.yiからyi+1へ行くには最低何step必要か求める
		//		AとBの合計がNを超えたらまずアウト
		//		AとBの合計 = NならOK
		//		AとBの合計 < Nでも、行ったり来たりをしてstep数を稼げば問題ない
		//			ではデータも持ち方をどうするか
		//			→クラスのインスタンス化して、動的配列に順番に格納。インデックスの隣のインスタンス間を比較して、移動が可能かどうか判断
		//				→判断の途中、一つでも移動が不可能な場合があったらbreak

		//②tiの地点から、指定されたstep数で移動できる地点を全部洗いだして、目的の地点と比較して移動できるかどうか判断
		// →計算量が少なくない

		//③


		boolean possible = solve_1(points);


		//output
		//	step Nで、移動可能な範囲であるかどうかの判断結果

		if(possible) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		//

	}

	public static boolean solve_1(ArrayList<location> points) {

		boolean possible = true;

		for(int j = 0; j < points.size()-1; j ++) {
			//debug pring
			//points.get(j).print_member_value();

			location pre_point = points.get(j);
			location next_point = points.get(j+1);

			int step = next_point.ti - pre_point.ti;
			int x_must_step = next_point.x - pre_point.x;
			int y_must_step = next_point.y - pre_point.y;

			int must_step = x_must_step + y_must_step;
			int surplus_step = step - must_step;

			if(must_step > step) {//1つでも、不可能な旅程が存在した時点で、「No」判定
				possible = false;
				break;
			}else if(must_step == step) {
				continue;
			}else if(must_step < step && (surplus_step % 2 == 0)){//同じ場所に行ったり来たりしてstep数を無駄に稼げばいける(但し、偶数ステップ数でないと、指定時間に元の位置に戻れない)
				continue;
			}else {
				possible = false;
				break;
			}


		}

		return possible;
	}

}
