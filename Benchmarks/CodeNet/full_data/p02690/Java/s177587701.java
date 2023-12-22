import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			long X = scn.nextLong();
			long A = 0;
			long B = 0;
			long tmp = 0;

			for(int i = 0; i < 500; i++) {
				A = i;
				A *= i;
				A *= i;
				A *= i;
				A *= i;

				tmp = X - A;

				for(int j = 0; j < 500; j++) {
					B = j;
					B *= j;
					B *= j;
					B *= j;
					B *= j;

					if(tmp == B) {
						System.out.println(i + " " + (j * -1));
						break;
					}

					if(tmp == (B * -1)) {
						System.out.println(i + " " + j);
						break;
					}

					if(tmp <= B) break;

				}
			}
		}
	}
}