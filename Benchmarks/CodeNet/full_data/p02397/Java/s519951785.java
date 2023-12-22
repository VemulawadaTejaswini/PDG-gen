import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> resultList = new ArrayList<String>();

		boolean flg = true;

		while (flg) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			if (a > b) {
				resultList.add(b + " " + a);
			} else if (a < b) {
				resultList.add(a + " " + b);
			} else if (0 == a && 0 == b) {
				flg = false;
				break;
			}else if(a == b){
				resultList.add(a + " " + b);
			}

		}

		for (int i = 0; i < resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
	}
}