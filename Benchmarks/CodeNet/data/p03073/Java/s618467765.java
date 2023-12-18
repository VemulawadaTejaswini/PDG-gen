import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String[] strArray = str.split("");
		int first0Result = 0;
		int first1Result = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (i % 2 != Integer.parseInt(strArray[i])) {
				first0Result++;
			} else {
				first1Result++;
			}
			
		}
		

		if (first0Result > first1Result) {
			System.out.println(first1Result);
		} else {
			System.out.println(first0Result);
		}
		
	}

}