import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] a) {
		int[] list = new int[10];
		for (int i = 0; i < 10; ++i) {
			list[i] = Integer.parseInt(scan.nextLine());
		}
		Arrays.sort(list);
		print(list[9]);
		print(list[8]);
		print(list[7]);
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}