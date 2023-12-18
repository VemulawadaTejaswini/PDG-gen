import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();

		sc.close();

		if(A >= K) {
			System.out.println(A);
		}else {
			//Aで収まらなかった場合
			K -= A;
			if(B >= K) {
				System.out.println(A);
			}else {
				//AもBも使い切った
				K -= B;
				System.out.println(A-K);
			}
		}

	}

}
