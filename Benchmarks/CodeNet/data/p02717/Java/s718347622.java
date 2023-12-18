import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//配列3つ用意
		int[] X = new int[3];

		//3回繰り返す
		for(int i = 0; i < 3;i++) {
			X[i]  = sc.nextInt();

		}


		int change = 0;
		change = X[0];
		X[0] = X[1];
		X[1] =change;

		int change1= 0;
		change1 = X[0];
		X[0] = X[2];
		X[2] = change1;


		for(int j = 0; j<3;j++) {
			System.out.print(X[j]+" ");
		}


		sc.close();


	}

}
