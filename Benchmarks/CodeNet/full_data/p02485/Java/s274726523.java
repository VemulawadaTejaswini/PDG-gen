import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner (System.in);

		String num;

		while ((num = sc.next()).equals("0") == false) {
			char [] number = num.toCharArray();
			int result = 0;
			for (int i = 0; i < number.length; i++) {
				result += Integer.valueOf(String.valueOf(number[i]));
			}
			System.out.println(result);
		}

	}

}