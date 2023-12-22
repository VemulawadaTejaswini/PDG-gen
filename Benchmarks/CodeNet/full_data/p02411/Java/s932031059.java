import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, f, r;
		char result = 0;
		while (true) {
			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();

			if (m == -1 && f == -1 && r == -1)
				break;

			if ((m + f) >= 80)
				result = 'A';
			else if ((m + f) >= 65)
				result = 'B';
			else if ((m + f) >= 50)
				result = 'C';
			else if ((m + f) >= 30) {
				if (r >= 50)
					result = 'C';
				else
					result = 'D';
			} else
				result = 'F';
			System.out.println(result);
		}
	}

}