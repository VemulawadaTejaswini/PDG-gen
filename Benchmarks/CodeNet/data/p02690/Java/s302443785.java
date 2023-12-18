import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long x = scan.nextLong();
		
		long answerA = 0;
		long answerB = 0;

		for (long a = 0; a < 100; a++) {
			
			for (long b = -100; b < 100; b++) {
				
				if (x == Math.pow(a, 5) - Math.pow(b, 5)) {
					answerA = a;
					answerB = b;
				}
			}
		}

		println(answerA + " " + answerB);
	}

	public static void println(Object target) {
		System.out.println(target);
	}
}
