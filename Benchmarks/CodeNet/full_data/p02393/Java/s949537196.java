import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		int[] intArray = new int[3];
		intArray[0] = Integer.parseInt(str1);
		intArray[1] = Integer.parseInt(str2);
		intArray[2] = Integer.parseInt(str3);

		for (int i = 0; i < intArray.length - 1; i++) {
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] > intArray[j]) {
					int tmp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = tmp;
				}
			}
		}
		System.out.println(intArray[0] + "\t" + intArray[1] + "\t" + intArray[2]);
	}
}
