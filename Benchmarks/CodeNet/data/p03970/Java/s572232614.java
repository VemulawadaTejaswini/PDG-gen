import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String[] strStdIn = new String[1];
		int m = 0;
		while (m != 1) {
			strStdIn[m] = scanner.nextLine();
			m++;
		}

		String target = strStdIn[0];

		String rightString = "CODEFESTIVAL2016";
		int count = 0;

		for (int i=0; i < rightString.length(); i++) {
			if (!target.substring(i, i+1).equals(rightString.substring(i, i+1))) {
				count++;
			}
			if (i + 1 == rightString.length()) {
				break;
			}
		}
		
		System.out.println(count);
    	}
}