import java.util.Scanner;

// https://atcoder.jp/contests/abc139/tasks/abc139_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String T = sc.nextLine();
		sc.close();

		int ans = 0;

		String[] arrayS = S.split("");
		String[] arrayT = T.split("");

		for(int i=0;i<arrayS.length;i++) {
			if(arrayS[i].equals(arrayT[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
