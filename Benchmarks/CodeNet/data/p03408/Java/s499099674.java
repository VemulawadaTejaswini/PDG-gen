import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] blue = new String[n];
		for(int i = 0; i < n; i++) {
			blue[i] = scan.next();
		}


		int m = scan.nextInt();

		String[] red = new String[m];
		for(int i = 0; i < m; i++) {
			red[i] = scan.next();
		}

		int resultscore = 0;

		for(int roop = 0; roop < n; roop++){

			int score = 0;

			for(int k = 0; k < n; k++) {
				if(blue[k].equals(blue[roop]))score = score + 1;
			}
			for(int j = 0; j < m; j++) {
				if(red[j].equals(blue[roop])) score = score - 1;
			}

			if(resultscore < score) {
				resultscore = score;
			}
		}

		if(resultscore < 0)resultscore = 0;

		System.out.println(resultscore);



	}

}