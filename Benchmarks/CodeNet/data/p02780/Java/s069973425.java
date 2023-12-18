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
		int[] curdices = new int[k];
		for(int i = 0; i < n; i++) {	//ダイス総数
			for (int j = 0; j < k; j++) {	//K 隣接するダイス数
				tmpdices[j] = dices[i+j];	//ダイス設定

				for(int h = 0; h < tmpdices[j]; h++) {	//期待値計算
					tmpdiceMax +=  h+1 / tmpdices[j];
				}
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