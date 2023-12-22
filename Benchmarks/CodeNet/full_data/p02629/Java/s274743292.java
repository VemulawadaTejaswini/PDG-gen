import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		long N = sc.nextLong();

		ArrayList<Long> divList = new ArrayList<>();

		for(int i = 1; i <= 15; i++) {
			long syou  = N / 26;
			long amari = N % 26;

			divList.add(amari);

			if(syou == 0) {
				break;
			}else {
				N = syou;
			}
		}

		String answer = "";

		for(int i = divList.size()-1; i >= 0; i-- ) {
			//System.out.println(divList.get(i));
			int num = (int) (divList.get(i) + 96);
			char word = (char) num;
			//System.out.println(word);
			answer += word;
		}

		System.out.println(answer);
	}

}
