import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReconstruction {

	/**
	 * @param args
	 * @throws IOException
	 */

	static int[] zeroes;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input = scan.readLine();
		int changes = Integer.parseInt(input);
		//conChanges = changes;
		input = scan.readLine();
		 String[] array = input.split(" ");
		 zeroes = new int[changes];
		 set(changes);
		 System.out.println(max(0, changes, array));

	}

	public static int max(int index, int changes, String[] array) {
		if (changes == 0) {
			return cal(array);
		}

		if (index >= array.length && changes != 0 || (changes < 0)) {
			return (int) -10e9;
		}
		int choice1 = (int) -10e9;
		int choice2 = (int) -10e9;

		choice1 = max(index+1, changes, array);
		if (changes > 0) {
			zeroes[changes - 1] = index;
			choice2 = max(index+1, changes - 1, array);

		}
		return Math.max(choice1, choice2);
	}

	public static int cal(String[] array) {
		int number = (((array.length)- zeroes.length)/2);
		int taken = 0;
		int sum1 = 0;
		int sum2 = 0;
		int i = 0;
		for (i = 0; taken < number; i++) {
			if (!include(i)) {
				sum1 += Integer.parseInt(array[i]);
				taken++;
			}

		}
		int start = i;
		for (i = start; i <array.length; i++) {
			if (!include(i)) {
				sum2 += Integer.parseInt(array[i]);
			}

		}


		return sum1 - sum2;
	}

	public static boolean include(int number) {
		for (int i = 0; i < zeroes.length; i++) {
			if (number == zeroes[i]) {
				return true;
			}
		}
		return false;
	}

	public static void set(int changes) {
		for (int i = 0; i <changes; i++) {
			zeroes[i] = -1;
		}
	}

}