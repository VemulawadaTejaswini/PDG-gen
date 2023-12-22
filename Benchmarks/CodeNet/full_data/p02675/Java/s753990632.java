import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute(System.in);
	}

	public void execute(InputStream in) {
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();

		String s = "";
		n = n % 10;
		switch (n) {
		case 2:
		case 4:
		case 5:
		case 7:
		case 9:
			s = "hon";
			break;
		case 0:
		case 1:
		case 6:
		case 8:
			s = "pon";
			break;
		case 3:
			s = "bon";
			break;
		}

		System.out.println(s);
		sc.close();
	}
}
