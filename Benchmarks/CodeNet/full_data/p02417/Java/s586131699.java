import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = "";
		String Alpha = "abcdefghijklmnopqrstuvwxyz";
		int output[] = new int[26];
		int index = 0;
		int MAX = 1000;
		int mozi_length = 0;
		String each_mozi = "";

		out: for (int i = 0; i < MAX; i++) {
			input = sc.nextLine();
			if (input.equals("")) {
				break out;
			}
			String[] mozi = (input.toLowerCase()).split(" ");

			for (int j = 0; j < mozi.length; j++) {
				each_mozi = mozi[j];
				for (int k = 0; k < each_mozi.length(); k++) {
					index = Alpha.indexOf("" + each_mozi.charAt(k));
					if (index != -1) {
						output[index]++;
					}
					mozi_length += each_mozi.length();
				}
				if (mozi_length >= 1200) {
					break out;
				}
			}
		}

		if (mozi_length < 1200 && mozi_length != 0) {

			for (int m = 0; m < output.length; m++) {
				System.out.println("" + Alpha.charAt(m) + " : " + output[m]);

			}
		}

	}
}

