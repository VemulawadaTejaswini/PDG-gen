import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		long D = sc.nextLong();
		sc.close();

		// for (int i = A; i < B+1; i++) {
		// if(i%C!=0&&i%D!=0)
		// cnt++;
		// };
		// とやると10^18なのでたぶんTLE
		// BまでのCの倍数の数:NbC
		// Dの倍数の数:NbD
		// CDの倍数の数:NbCD
		// B-(NbC+NbD-NbCD)って話だと思う
		// 同様にA-1までのCの倍数の数:NaC

		// 入力例2に助けられたC*Dに公約数があるとそれで重複する
		// NbCDは最小公倍数の倍数
		// 最小公倍数はC*D/最大公約数
		// これでもO(C)でやったらTLEでは
		// ユークリッドの互除法がいいらしい

		// long maxKouyakusu = 1;
		// for (int i = 2; i < C + 1; i++) {
		// if (C % i == 0 && D % i == 0)
		// maxKouyakusu = i;
		// }
		// System.out.println(maxKouyakusu);
		long smaller;
		long r_i;
		long r_i1;
		long t_A = C;
		long t_B = D;
		if (t_A >= t_B) {
			smaller = t_B;
			r_i = t_A - t_B;
			r_i1 = t_B;
		} else {
			smaller = t_A;
			r_i = t_B - t_A;
			r_i1 = t_A;
		}
		while (r_i != 0) {
			t_A = smaller;
			t_B = r_i;
			r_i1 = r_i;
			if (t_A >= t_B) {
				smaller = t_B;
				r_i = t_A - t_B;
			} else {
				smaller = t_A;
				r_i = t_B - t_A;
			}
		}

		long NbC = B / C;
		long NbD = B / D;
		long NbCD = B / (C * D / r_i1);

		long NaC = (A - 1) / C;
		long NaD = (A - 1) / D;
		long NaCD = (A - 1) / (C * D / r_i1);

		long ans = B - NbC - NbD + NbCD - (A - 1 - NaC - NaD + NaCD);

		System.out.println(ans);

	}
}