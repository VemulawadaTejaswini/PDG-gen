import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		while(stdin.hasNextInt()) {
			int student = stdin.nextInt();
			
            if(student == 0) {
            	break;
            }
			int m = stdin.nextInt();
			int e = stdin.nextInt();
			int j = stdin.nextInt();
			int averageTwo = (m + e) / 2;
			int average = (m + e + j) / 3;

			if(m == 100 || e == 100 || j == 100 || averageTwo >= 90 || average >= 80) {
				System.out.println("A");
			} else if((80 >= average && average >= 70) || (average >= 50 && m >= 80 || e >= 80)) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}

	}

}