import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean[] array = new boolean[str.length()];
		boolean[] array2 = new boolean[str.length()];
		for (int i = 0; i < array.length; i++) {
			if (str.charAt(i) == '1') {
				array[i] = true;
			}
		}
		int count = 0;
		boolean continueFlag = false;
		do {
			continueFlag = false;
			for (int i = 0; i < array.length - 2; i++) {
				boolean flag = true;
				if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
					array[i + 1] = !array[i + 1];
					array2[i + 1] = !array2[i + 1];
					count++;
					continueFlag = true;
				}
			}
		} while (continueFlag);
		continueFlag = false;
		int count1 = count;
		int count2 = count + 1;
		do {
			continueFlag = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] == array[i + 1]) {
					array[i + 1] = !array[i + 1];
					count1++;
					continueFlag = true;
				}
			}
		} while (continueFlag);
		continueFlag = false;
		array2[0] = !array2[0];
		do {
			continueFlag = false;
			for (int i = 0; i < array2.length - 1; i++) {
				if (array2[i] == array2[i + 1]) {
					array2[i + 1] = !array2[i + 1];
					count2++;
					continueFlag = true;
				}
			}
		} while (continueFlag);
		System.out.println(Math.min(count1, count2));
	}
}
