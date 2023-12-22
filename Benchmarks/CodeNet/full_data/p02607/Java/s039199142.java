import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String[] input2 = sc.nextLine().split(" ");

		int count = 0;

		for (int i = 0; i < input2.length; i++) {
			if(i%2 != 0) {
				if (Integer.parseInt(input2[i]) %2 != 0) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}