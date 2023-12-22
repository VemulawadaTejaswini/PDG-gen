import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String [] line = scanner.nextLine().split(" ");
			int m = Integer.parseInt(line[0]);
			int f = Integer.parseInt(line[1]);
			int totalTest = m + f;
			int r = Integer.parseInt(line[2]);
			if (totalTest + r == -3) {
				break;
			}
			if (totalTest < 30 ||m == -1 || f == -1) {
				System.out.println("F");
			} else {
				if (totalTest >= 80)
					System.out.println("A");
				if (totalTest < 80 && totalTest >= 65)
					System.out.println("B");
				if (totalTest < 65 && totalTest >= 50)
					System.out.println("C");
				if (totalTest >= 30 && totalTest < 50 && r >= 50)
					System.out.println("C");
				if (totalTest >= 30 && totalTest < 50 && r < 50)
					System.out.println("D");
			}
		}
	}
}