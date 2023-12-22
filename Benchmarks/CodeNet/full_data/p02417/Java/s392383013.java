import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String input = "";
		String Alpha = "abcdefghijklmnopqrstuvwxyz";
		int output[] = new int[26];
		int index = 0;

		input = sc.nextLine();
		String[] mozi = input.toLowerCase().split(" ");
		int mozi_length = 0;
		String each_mozi = "";

		for (int i = 0; i < mozi.length; i++) {
			each_mozi = mozi[i];
			for (int j = 0; j < each_mozi.length(); j++) {
				index = Alpha.indexOf("" + each_mozi.charAt(j));
				if (index != 0) {
					output[index]++;
				}
				mozi_length += each_mozi.length();
			}

		}

		if (mozi_length < 1200 && mozi_length != 0) {

			for (int k = 0; k < output.length; k++) {
				System.out.println("" + Alpha.charAt(k) + " : " + output[k]);

			}
		}

	}
}

