import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] black = new boolean[n];
		boolean[] black2 = new boolean[n];
		String str = sc.next();
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) == '#') {
				black[i] = true;
				black2[i] = true;
			}
		}
		
		System.out.println(Math.min(exec(black, 0, 0), exec2(black2, n - 1, 0)));
	}
	
	public static int exec(boolean[] array, int index, int count) {
		if (index >= array.length - 1) {
			return count;
		} else {
			if (!array[++index] && array[index - 1]) {
				++count;
				array[index] = !array[index];
			}
			return exec(array, index, count);
		}
	}
	
	public static int exec2(boolean[] array, int index, int count) {
		if (index <= 0) {
			return count;
		} else {
			if (array[--index] && !array[index + 1]) {
				++count;
				array[index] = !array[index];
			}
			return exec2(array, index, count);
		}
	}
}