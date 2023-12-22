import java.util.Scanner;

public class Main {

	public static int linearSearch(int[] first, int[] second) {
		int output = 0;
		
		for (int i = 0; i < second.length; i++) {
			boolean match = false;
			for (int j = 0; j < first.length; j++) {
				if (second[i] == first[j] && !match) {
					match = true;
				}
			}
			if (match) {
				output++;
			}
		}
		return output;
	}

	public static int[] toArray(String s, int l) {
		Scanner in = new Scanner(s);
		int[] output = new int[l];
		for (int i = 0; i < l; i++) {
			output[i] = in.nextInt();
		}
		in.close();
		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int lengthOne, lengthTwo;
		String arrayOne, arrayTwo;

		lengthOne = in.nextInt();
		in.nextLine();
		arrayOne = in.nextLine();

		lengthTwo = in.nextInt();
		in.nextLine();
		arrayTwo = in.nextLine();

		int[] first = toArray(arrayOne, lengthOne);
		int[] second = toArray(arrayTwo, lengthTwo);
		System.out.println(linearSearch(first, second));

		in.close();
	}
}

