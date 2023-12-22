	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			Scanner scn = new Scanner(System.in);
			int N = scn.nextInt();
			int X = scn.nextInt();
			int T = scn.nextInt();

			int num = 0;


			while (N > 0) {
				num ++;
				N = N - X;
			}

			System.out.println(num * T);

		}
}