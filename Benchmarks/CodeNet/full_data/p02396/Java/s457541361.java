import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		int count = 1;
		while (true) {
			int num = scan.nextInt();
			if (num == 0) {
				scan.close();
				text.deleteCharAt(text.lastIndexOf("\n"));
				System.out.println(text.toString());
				break;
			} else {
				text.append("Case ").append(count).append(": ").append(num).append("\n");
				count++;
			}
		}
	}

}