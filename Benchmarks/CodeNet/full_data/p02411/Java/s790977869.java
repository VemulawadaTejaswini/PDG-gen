import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			String [] line = scanner.nextLine().split(" ");
			int test01 = Integer.parseInt(line[0]);
			int test02 = Integer.parseInt(line[1]);
			int totalTest = test01 + test02;
			int rTest = Integer.parseInt(line[2]);
			if (totalTest + rTest == -3) {
				break;
			}
			if (totalTest < 30 ||test01 == -1 || test02 == -1) {
				System.out.println("F");
			} else {
				if (totalTest >= 80)
					System.out.println("A");
				if (totalTest < 80 && totalTest >= 65)
					System.out.println("B");
				if (totalTest < 65 && totalTest >= 50)
					System.out.println("C");
				if (totalTest >= 30 && totalTest < 50 && rTest >= 50)
					System.out.println("C");
				if (totalTest >= 30 && totalTest < 50 && rTest <= 50)
					System.out.println("D");
			}
		}
	}
}