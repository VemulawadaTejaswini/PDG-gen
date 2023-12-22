import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		String[] array = new String[A];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.next();
		}

		int AC = 0;
		int WA = 0;
		int TLE = 0;
		int RE = 0;

		for (int j = 0; j < A; j++) {
			if (array[j].equals("AC")) {
				AC++;
			} else if (array[j].equals("WA")) {
				WA++;
			} else if (array[j] .equals("TLE")) {
				TLE++;
			} else if (array[j] .equals("RE")) {
				RE++;
			}
		}

		System.out.println("AC x "+AC);
		System.out.println("WA x "+WA);
		System.out.println("TLE x "+TLE);
		System.out.println("RE x "+RE);

	}

}