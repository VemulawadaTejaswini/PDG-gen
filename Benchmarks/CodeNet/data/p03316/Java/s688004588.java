import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int value = Integer.parseInt(str);
		int divNum = 0;
		for (int i = 0; i < str.length(); ++i) {
			Character c = str.charAt(i);
			divNum += Integer.parseInt(c.toString());
		}
		if (value % divNum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		in.close();

	}

}