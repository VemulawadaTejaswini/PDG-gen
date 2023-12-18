import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 1;//lの最大値格納先
		int min = n;//Rの最小値格納先
		int l;
		int r;
		for (int i = 1; i <= m; i++) {
			l = sc.nextInt();
			r = sc.nextInt();//ｌとｒを取得

			if (l > max) {
				max = l;
			}
			if (r < min) {
				min = r;
			}//普通にlとrの最大、最小をいつものやり方で出す
		}
		//lとrの最大、最小の差を取り、1を足す(2～6の鍵がOKの時、鍵は5本だが6-2=4になってしまうのでその分の調整)

		int ans = min - max + 1;
		if (ans >= 0) {//ansが正ならそのまま表示
			System.out.println(ans);
		} else {//ansが負なら鍵は存在しないので0を表示
			System.out.println(0);
		}
	}
}
