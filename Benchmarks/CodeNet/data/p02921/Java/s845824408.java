import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		String input2 = scanner.nextLine();

		int j = 0;
		int OK = 0;

		for(String i  : input.split("")) {
			if(i.equals(input2.split("")[j])) {
				OK=OK+1;
			}
			j=j+1;
		}
		System.out.println(OK);
	}
}