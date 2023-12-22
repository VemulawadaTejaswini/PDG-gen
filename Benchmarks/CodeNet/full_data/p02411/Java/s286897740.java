import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		while (true) {
			int test = scanner.nextInt() + scanner.nextInt();
			int rTest = scanner.nextInt();
			if (test + rTest == -3) {
				break;
			}
			if (test >= 80) {
				System.out.println("A");
			} else if (test < 80 && test >= 65) {
				System.out.println("B");
			} else if (test < 65 && test >= 50) {
				System.out.println("C");
			} else if (test >= 30 && test < 50 && rTest >=50) {
				System.out.println("C");
			} else if (test >= 30 && test < 50 && rTest <= 50) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}