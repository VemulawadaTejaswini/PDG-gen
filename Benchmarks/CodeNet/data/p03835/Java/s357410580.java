import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String inputString = scanner.nextLine();
		String[] strStdIn = inputString.split(" ", 0);
		
		int initialNum = Integer.parseInt(strStdIn[0]);
		int totalNum = Integer.parseInt(strStdIn[1]);
		int count = 0;

		for (int i=0; i <= initialNum; i++) {
			for (int m=0; m <= initialNum; m++) {
				for (int n=0; n <= initialNum; n++) {
					if (i + m + n == totalNum) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}