

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s1 = scanner.next();
		char[] a1 = s1.toCharArray();
		String s2 = scanner.next();
		char[] a2 = s2.toCharArray();
		int counter = 0;
		for (int j = 0; j < a1.length; j++) {
			if (a1[j] == a2[counter]) {
				counter++;
			}else{
				counter = 0;
			}
		}
		System.out.println( n + n - counter);
	}
}
