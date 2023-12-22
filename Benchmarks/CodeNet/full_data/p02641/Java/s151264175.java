import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
// C - Forbidden List
class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

		ArrayList<Integer> lstA;
		ArrayList<Integer> lstD;

		lstA = new ArrayList<Integer>();
		lstD = new ArrayList<Integer>();


		if (N==0) {
			System.out.println(X);
			return;
		}

		for (int i=0; i < N; i++) {
			int x = sc.nextInt();
			lstD.add(x);

//			if (x==X) {
//				System.out.println(x);
//				return;
//			}
		}

		// 配列初期値
		for (int i=1; i <= 100; i++) {
			if (!lstD.contains(i)) {
				lstA.add(i);
			}
		}



		Collections.sort(lstA);

		for (int i=0; i<lstA.size(); i++) {
			// 大きくなったら -- 大きいのがない場合もあとで考慮
			if (lstA.get(i) > X) {
				int bef;
				int aft;
				// 前後しらべる
				if (i==0) {
					bef = 200;
				} else {
					bef = Math.abs(lstA.get(i-1) - X);
				}
				aft = Math.abs(lstA.get(i) - X);

				if (aft==bef) {
					// 同じ場合は小さい方
					System.out.println(lstA.get(i-1));
					return;
				} else if (aft > bef) {
					System.out.println(lstA.get(i-1));
					return;
				} else if (aft < bef) {
					// 0との位置を計算
					bef = Math.abs(0 - X);
					if (aft < bef) {
						System.out.println(lstA.get(i));
					} else {
						System.out.println(0);
					}
					return;
				} else {
					System.out.println(aft  + "@" + bef);
					return;
				}
			}
		}

		// 大きいのがない場合はリストの最大
		if (lstA.size() == 0) {
			// 除外数値が100個の場合を考慮
			if (X > 50) {
				System.out.println(101);
			} else {
				System.out.println(0);
			}
		} else {
			// 101との位置を計算
			int bef1 = Math.abs(lstA.get(lstA.size()-1) - X);
			int aft1 = Math.abs(101 - X);
			if (bef1 < aft1) {
				System.out.println(lstA.get(lstA.size()-1));
			} else {
				System.out.println(101);
			}
		}


	}
}