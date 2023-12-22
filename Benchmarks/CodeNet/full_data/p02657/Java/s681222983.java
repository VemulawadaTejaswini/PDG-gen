import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		String stVal = scan.nextLine();

		String[] test = stVal.split(" ");
		System.out.println(Integer.parseInt(test[0]) * Integer.parseInt(test[1]));


		scan.close();
	}

}