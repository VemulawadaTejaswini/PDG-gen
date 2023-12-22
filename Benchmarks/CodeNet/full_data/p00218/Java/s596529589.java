import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int student = stdin.nextInt();
		String[] result = new String[student];

		for(int i = 0; i < student; i++) {
			int m = stdin.nextInt();
			int e = stdin.nextInt();
			int j = stdin.nextInt();
			int averageTwo = (m + e) / 2;
			int average = (m + e + j) / 3;

			if(m == 100 || e == 100 || j == 100 || averageTwo >= 90 || average >= 80) {
				result[i] = "A";
			} else if((80 >= average && average >= 70) || (average >= 50 && m >= 80 || e >= 80)) {
				result[i] = "B";
			} else {
				result[i] = "C";
			}
		}
		for(int a = 0; a < student; a++) {
			System.out.println(result[a]);
		}

	}

}