import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanN = new Scanner(System.in);
		Scanner scanA = new Scanner(System.in);
		int intVal = scanN.nextInt();
		if (intVal >= 2 && intVal <= 100000) {

			String stVal = scanA.nextLine();

			String[] test = stVal.split(" ");

			Long sum = Long.parseLong(test[0]);
			for (int i = 1; i < test.length; i++) {
				sum = sum * Long.parseLong(test[i]);
			}

			if (sum >= 0 && sum <= Math.pow(10, 18)) {
				System.out.print(sum);
			} else {
				System.out.print(-1);
			}


		} else {
			System.out.print(0);
		}

		scanN.close();
		scanA.close();
	}

}
