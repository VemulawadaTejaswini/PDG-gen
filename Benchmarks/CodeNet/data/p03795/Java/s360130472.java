import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		/*
		 * すぬけくん行きつけのレストランは何を食べても 1 食 800 円で、15 食食べる毎にその場で 200 円もらえます。

すぬけくんは今までで合計 N 食食べました。 今までに払った金額を x 円、レストランからもらった金額を y 円として、x−y を求めなさい。
		 */

		int y = n / 15 * 200;
		int x = n * 800;
		System.out.println(x - y);

	}
}