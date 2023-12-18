import java.util.Scanner;
public class Main {
	public static void main (String[] args) {

//	パターン1（Aから順番に使って足していく）
//	変数を読み込む
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		int total = 0;  //合計を入れる変数

//	A＞＝Kの場合の処理
		if(A >= K) {
			total = K;
			System.out.println(total);
			return;
		}
		else {  //A＜Kの場合は続く
			for(int i=0 ; i<=K ; i++) {
			total += i;
			}
		}

		if(B >= K-A) {
			System.out.println(total);
			return;
		}
		else {  //A＋B＜Kの場合は続く
			for(int i=0 ; i>=K-A-B ; i++) {
				total += i;
				System.out.println(total);
				return;
			}
		}
	}
}