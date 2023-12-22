import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)){
			int n = sc.nextInt();
			int b,f,r,v;
			int[][][] table = new int[4][3][10];
			for (int i=0; i < 4; i++) {
				for (int j=0; j < 3; j++) {
					for (int k=0; k < 10; k++) {
						table[i][j][k] = 0;  //初期化
					}
				}
			}

			//読み取って処理
			for (int i = 0; i<n; i++) {
				b = sc.nextInt();
				f = sc.nextInt();
				r = sc.nextInt();
				v = sc.nextInt();
				table[b-1][f-1][r-1] += v;
			}

			Show(table);

		}
	}

	//結果を表示
	static void Show(int[][][] t) {
		for (int i=0; i < 4; i++) {
			for (int j=0; j < 3; j++) {
				for (int k=0; k < 10; k++) {
					System.out.print(" "+t[i][j][k]);
				}
				System.out.print('\n');
			}
			if (i != 3)System.out.println("####################");
		}
	}
}
