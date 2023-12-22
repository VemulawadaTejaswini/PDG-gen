

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while(true) {

			int middle = in.nextInt();
			int term_end = in.nextInt();
			int retest = in.nextInt();
			int sum = middle + term_end;

			if(middle == -1 && term_end == -1 && retest == -1) {

				break;

			}else if(middle == -1 || term_end == -1) {

				System.out.println("F");

			}else if(sum >= 80) {

				System.out.println("A");

			}else if(sum < 80 && sum >= 65) {

				System.out.println("B");

			}else if(sum < 65 && sum >= 50) {

				System.out.println("C");

			}else if(sum < 50 && sum >= 30) {

				if(retest >=  50) {

					System.out.println("C");

				}else {

					System.out.println("D");

				}

			}else if(sum < 30) {

				System.out.println("F");

			}
		}
	}
}