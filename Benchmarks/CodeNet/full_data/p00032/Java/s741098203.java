import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int rectangular = 0;
		int dimond = 0;

		while(sc.hasNext()) {
			String[] numbers = sc.nextLine().split(",");

			int[] number = new int[3];
			Arrays.fill(number, 0);
			for(int $ = 0; $ < 3; $++) {
				number[$] = Integer.parseInt(numbers[$]);
			}

			int box = 0;
			if(number[0] < number[1]) {
				box = number[0];
				number[0] = number[1];
				number[1] = box;
			}
			if(number[0] < number[2]) {
				box = number[0];
				number[0] = number[2];
				number[2] = box;
			}


			if(Math.pow(number[0], 2) == Math.pow(number[1], 2) + Math.pow(number[2], 2)) {
				rectangular++;
			} else if(number[1] == number[2]) {
				dimond++;
			}
		}

		System.out.println(rectangular);
		System.out.println(dimond);

	}

}