import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt(), l[] = new int[n * 2], tmp = 0;
		for(int i = 0; i < l.length; i++) {
			l[i] = scanner.nextInt();
		}
		Arrays.sort(l);
		reverse(l);
		for(int i = 0; i < n; i++) {
			tmp += l[(i * 2) + 1];
		}
		System.out.println(tmp);
	}

	public static void reverse(int[] array) {
		int len = array.length, tmp;
		for (int i = 0; i < len / 2; i++) {
			tmp = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = tmp;
		}
	}
}
