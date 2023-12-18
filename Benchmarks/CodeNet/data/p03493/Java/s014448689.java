import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	private void execute() {

		String initString = getParameter();

		int count = 0;
		int index = 0;

		for (; index < initString.length(); index++) {
			if ('1' == (initString.charAt(index))) {
				count++;
			}
		}

		outputAnswer(String.valueOf(count));
	}

	private String getParameter() {

		Scanner scan = new Scanner(System.in);

		String ret = scan.next();

		scan.close();

		return ret;
	}

	private void outputAnswer(String answer) {
		System.out.println(answer);
	}
}
