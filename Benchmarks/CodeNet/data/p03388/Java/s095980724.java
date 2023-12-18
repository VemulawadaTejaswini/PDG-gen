import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int q = Integer.parseInt(sc.next());
		for(int i = 0; i < q; i++) {
			int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());

			/**
			 *  アルゴリズムの方針
			 *  1a) a=1でない場合、1回目のコンテストの順位が1位、2回目のコンテストの順位がmin(a*b-1,10^9)位の人を考える
			 *  1b) a=1の場合、1回目のコンテストの順位が2位、2回目のコンテストの順位がmin(floor((a*b-1)/2),10^9)位の人を考える
			 *  1c) b=10^9の場合(1a),(1b)のmin第二項は10^9-1とする
			 *  2a) a,b=(1,1),(1,2),(2,1)の場合は(1a),(1b)に該当する人はいないので0を出力する
			 *  2b) (1a),(1b)の何れにせよその人は高橋くんより順位は上のはずなのでカウンターを1にする
			 *  3) 1回目の順位に1を足した人を考え、2回目のコンテストの順位を1つずつ下げて高橋くんより順位が上になる人を考える
			 *  4a) 2回目のコンテストの順位が高橋くんと同じなら順位を1つ下げる（(2a)の処理はここに入れ込む）
			 *  4b) 2回目のコンテストの順位が1まで行っても高橋くんより順位が下ならその時点でカウンターの値を出力する
			 *  4c) 高橋くんより順位が上の人がいれば、カウンターに1を足して(3)に戻る
			 */

			int s, t;
			if(a == 1) {
				s = 2;
				if(b == 1000000000) {
					t = Math.min((a * b - 1) / 2, 1000000000 - 1);
				}else {
					t = Math.min((a * b - 1) / 2, 1000000000);
				}
			}else {
				s = 1;
				if(b == 1000000000) {
					t = Math.min(a * b - 1, 1000000000 - 1);
				}else {
					t = Math.min(a * b - 1, 1000000000);
				}
			}

			int count = 0;
			for(; t >= 1; s++) {
				if(s != a) {
					for(int t1 = t; t1 >= 1; t1--) {
						if(t1 != b) {
							if(s * t1 < a * b) {
								count++;
								t = t1 - 1;
								break;
							}
						}
						t = 0;
					}
				}
			}

			System.out.println(count);
		}

	}

}
