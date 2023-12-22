
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String[] numString = scan.nextLine().split(" ");

		long[] numLong = new long[numString.length];

		for(int i = 0; i < numString.length ; i++) {
			numLong[i] = Long.parseLong(numString[i]);
		}

		numLong[2] = Math.abs(numLong[2]);

		for(int i = 0; i < numLong[1] ; i++) {
		if(numLong[0] > 0) {
				numLong[0] = numLong[0] - numLong[2];
		}
		else {
				numLong[0] = numLong[0] + numLong[2];
		}
		}
		System.out.println(Math.abs(numLong[0]));
	}

}