import java.util.Scanner;

public class Tsundoku {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String[] calender = { "sat", "fri", "thu", "wed", "tue", "mon", "sun" };

		for (int i = 0; i < calender.length; i++) {
			if (s.equals(calender[i]))
				System.out.println(i + 1);
		}

		sc.close();

	}

}
