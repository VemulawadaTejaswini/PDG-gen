import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer[] abc = new Integer[3];
		abc[0] = sc.nextInt();
		abc[1] = sc.nextInt();
		abc[2] = sc.nextInt();
		Arrays.sort(abc, Collections.reverseOrder());
		System.out.println(((abc[0] * 10) + abc[1]) + abc[2]);
	}
}