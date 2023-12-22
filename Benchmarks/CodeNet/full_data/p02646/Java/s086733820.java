import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();
		sc.close();

		String answer = "NO";

		for(int i = 0; i < T; i++) {
			if(B>A) {
				//右に動く
				A += V;
				B += W;
			}else if(B<A){
				A -= V;
				B -= W;
			}

			if(A == B) {
				answer = "YES";
				break;
			}

		}

		System.out.println(answer);

	}

}
