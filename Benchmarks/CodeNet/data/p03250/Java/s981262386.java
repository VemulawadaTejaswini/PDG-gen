

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] strArray = { scan.next(), scan.next(), scan.next() };
		Arrays.sort(strArray, Collections.reverseOrder());
		System.out.println(Integer.parseInt(strArray[0] + strArray[1]) + Integer.parseInt(strArray[2]));
	}
}
