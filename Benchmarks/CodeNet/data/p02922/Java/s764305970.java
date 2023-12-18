import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String AB = scanner.nextLine();

		int A = Integer.parseInt(AB.split(" ")[0]);

		int B = Integer.parseInt(AB.split(" ")[1]);

		int result;

		if(B%A != 0) {
			result=B/A +1;
		}else {
			result=B/A;

		}
		System.out.println(result);

	}

}