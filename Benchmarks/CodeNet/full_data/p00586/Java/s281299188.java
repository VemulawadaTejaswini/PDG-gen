import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			if (line == null) {
				break;
			} else {
				String[] lineAry = line.split(" ");
				System.out.println(Integer.parseInt(lineAry[0]) + Integer.parseInt(lineAry[1]));
			}
		}
	}
}