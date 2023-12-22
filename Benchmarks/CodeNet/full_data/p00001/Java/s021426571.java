import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		int i[] = new int[10];
		Scanner scan = new Scanner(System.in);
		for (int j = 0; j < i.length; j++) {
			i[j] = scan.nextInt();
		}
		Arrays.sort(i);
		for (int k = 9; k >= 7; k--) {
			System.out.println(i[k]);
		}
	}

}