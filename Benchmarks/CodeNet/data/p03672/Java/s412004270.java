import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		int length = S.length();
		int nextLength = length -1;

		StringBuilder sb = new StringBuilder(S);

		while(true) {
			if ((length -1) % 2 == 0) {
				String sub1 = S.substring(0, (length -1) / 2);
				String sub2 = S.substring((length -1) / 2, length -1);
				if (sub1.equals(sub2)) {
					System.out.println(length -1);
					return;
				} else {
					S = S.substring(0, S.length()-1);
				}
			}
		}



	}

}
