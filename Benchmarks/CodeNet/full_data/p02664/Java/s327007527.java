import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String T = scan.next();
		String[] array = T.split("");

		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("?")) {

					array[i] = "D";
				}

		}
		System.out.println(String.join("",array));

	}
}
