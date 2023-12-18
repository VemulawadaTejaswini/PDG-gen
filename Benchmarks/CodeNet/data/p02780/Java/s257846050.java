import java.util.Scanner;


public class Main {
	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] dices = new int[n];

		for(int i = 0; i < n; i++) {
			dices[i] = sc.nextInt();
		}

		double resultMax = 0;
		double diceMax = 0;
		double tmpdiceMax = 0;
		int[] tmpdices = new int[k];
		for(int i = 0; i < n - k; i++) {	//ダイス総数
			for (int j = 0; j < k; j++) {	//隣接するダイス数
				int dice = dices[i+j];

				for(int h = 0; h < dice; h++) {	//期待値計算
					tmpdiceMax +=  h+1 / dice;
				}
				tmpdiceMax /= dice;
				diceMax += tmpdiceMax;
				tmpdiceMax = 0.0d;
			}

			if(resultMax < diceMax) {
				resultMax = diceMax;
			}
		}


		System.out.println(resultMax);
	}
}
