import java.util.Scanner;

//第二回全国統一プログラミング王決定戦予選
//B Counting of Trees
public class Main {
	static final int DIV = 998244353;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] arrD = new int[N];
		for (int i = 0; i < N; i++) {
			arrD[i] = Integer.parseInt(sc.next());
		}
		sc.close();

		long ans = 0;
		if (arrD[0] == 0) {
			ans = arrD[1];
			for (int i = 2; i < N; i++) {
				ans *= arrD[i];
				ans %= DIV;
			}
		}
		System.out.println(ans);
	}
}
