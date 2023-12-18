import java.util.Scanner;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		int c = Integer.parseInt(sc.next());
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());

		/**
		 * 1)A+B<=2Cの場合
		 *  →A*X+B*Yが最低金額
		 * 2)A+B>2Cの場合
		 *  →まず、XとYの小さい方をZとして2C*Z必要
		 *    XとYとの差については、差*A or B or 2C 条件はコード参照
		 *    なお、X=Yなら2C*Xのみ
		 */
		
		int cost = 0;
		// (ai/2)に最も近い数を探索する
		if(a + b <= c * 2) {
			cost += (a * x) + (b * y);
		}else {
			cost += 2 * c * Math.min(x, y);
			if(x > y) {
				if(a <= c * 2) {
					cost += a * (x - y);
				}else {
					cost += 2 * c * (x - y);
				}
			}else if(x < y) {
				if(b <= c * 2) {
					cost += b * (y - x);
				}else {
					cost += 2 * c * (y - x);
				}
			}
		}
		System.out.println(cost);

	}

}
