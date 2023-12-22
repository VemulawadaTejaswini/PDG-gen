import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = "";
		String[] lineAry = new String[2];
		while (true) {
			line = sc.nextLine();
			if (line.length() == 0) {
				sc.close();
				break;
			} else {
				lineAry = line.split(" ");
				System.out.println(Long.parseLong(lineAry[0]) + Long.parseLong(lineAry[1]));
			}
		}
	}
}