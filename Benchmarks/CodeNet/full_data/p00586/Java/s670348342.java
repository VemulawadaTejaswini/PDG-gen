import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		String[] lineAry = new String[2];
		while (true) {
			line = sc.nextLine();
			if (line == null) {
				break;
			} else {
				lineAry = line.split(" ");
				System.out.println(Integer.parseInt(lineAry[0]) + Integer.parseInt(lineAry[1]));
			}
		}
	}
}