import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

       		String inputString = scanner.nextLine();

		String[] strStdIn = inputString.split(" ", 0);

		long start = Long.parseLong(strStdIn[0]);
		long end = Long.parseLong(strStdIn[1]);
		long divide = Long.parseLong(strStdIn[2]);

		long result = (end / divide) - (start / divide);

		System.out.println(result);
	}
}