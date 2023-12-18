import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String[] arr = new String[sc.nextInt()];
		sc.nextLine();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		Arrays.sort(arr);
		for(String e : arr) {
			System.out.print(e);
		}
		System.out.println();
	}
}