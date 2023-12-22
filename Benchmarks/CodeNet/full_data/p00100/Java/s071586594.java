import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter;
		while (sc.hasNextLine()) {
			counter = 0;
			int num = Integer.parseInt(sc.nextLine());
			if (num == 0) { break; }
			System.out.println(";"+num);
			for (int i=0; i < num; i++) {
				String[] array = sc.nextLine().split(" ", 0);
				int[] intArray = getIntArray(array);
				if (1000000 <= (intArray[1] * intArray[2])) {
					System.out.println(intArray[0]);
					counter++;
				}
			}
			if (counter == 0) {
				System.out.println("NA");
			}
		}
	}

	public static int[] getIntArray(String[] array) {
		int[] intArray = new int[array.length];
		for (int i=0; i<intArray.length; i++) {
			intArray[i] = Integer.parseInt(array[i]);
		}
		return intArray;
	}
}