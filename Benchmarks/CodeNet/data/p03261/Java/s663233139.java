import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int n = sc1.nextInt();
		String[] str = new String[n];

		for ( int i = 0 ; i < n ; i++ ) {
			str[i] = sc1.next();
		}

		String bef_word = str[0];
		String aft_word;

		char last = bef_word.charAt(bef_word.length() - 1);
		char first;

		boolean flg = true;

		for ( int i = 1 ; i < n ; i++ ) {
			aft_word = str[i];
			first = aft_word.charAt(0);
			if ( first != last) {
				flg = false;
				//System.out.println(i + " " + aft_word + " " + last + " " + first + " " + "尻取れず");
				break;
			}

			String[] temp_str = new String[i];
			System.arraycopy(str,0,temp_str,0,i);

			if (Arrays.asList(temp_str).contains(aft_word)) {
				flg = false;
				//System.out.println(i + " " + aft_word  + " " + "重複");
				break;
			}

			last = aft_word.charAt(aft_word.length() - 1);;
		}

		if (flg) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		sc1.close();

	}

}
