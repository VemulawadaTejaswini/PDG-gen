import java.util.Scanner;

public class Main {
	public static boolean[] array;
	public static int count = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		array = new boolean[str.length()];
		for (int i = 0; i < array.length; i++) {
			if (str.charAt(i) == '1') {
				array[i] = true;
			}
		}
		boolean p = array[0];
		exec(0);
		System.out.println(count);
	}
	
	public static boolean exec(int index) {
		if (index >= array.length - 1) {
			return false;
		} else {
			if (array[index] == array[index + 1]) {
				array[index + 1] = !array[index + 1];
				count++;
			}
			return exec(index + 1);
		}
	}
}
