import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); //社員数
		int A[] = new int[N-1]; //直属の上司
		int count = 0; //部下の人数

		for(int i=0; i<(N-1); i++) {
			A[i] = sc.nextInt();

		}

		//部下の人数を計算
		for(int n=1; n<=N; n++) {
			for(int B : A) {
				if(B == n) {
					count += 1;
				}
			}
			System.out.println(count);
			count = 0;
		}
	}

}
