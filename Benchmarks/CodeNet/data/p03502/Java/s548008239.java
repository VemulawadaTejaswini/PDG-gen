
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int XSum = 0;
		for(int i = 0; i < Integer.toString(X).length(); i++) {
			XSum += Integer.parseInt(Integer.toString(X).substring(i, i + 1));
		}
		System.out.println(X % XSum == 0 ? "Yes" : "No");
		scan.close();

	}

}
