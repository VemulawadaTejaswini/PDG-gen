import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean[] array = new boolean[str.length()];
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
					count++;
					continueFlag = true;
				}
			}
		} while (continueFlag);
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == array[i + 1]) {
				array[i + 1] = !array[i + 1];
				count++;
			}
		}
		System.out.println(count);
	}
}
