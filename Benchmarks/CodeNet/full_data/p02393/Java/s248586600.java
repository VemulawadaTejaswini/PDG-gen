
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] intArray = new int[3];
		intArray[0] = sc.nextInt();
		intArray[1] = sc.nextInt();
		intArray[2] = sc.nextInt();
		Arrays.sort(intArray);
		StringBuilder sb = new StringBuilder();
		for (int i : intArray) {
			sb.append(i);
			sb.append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}