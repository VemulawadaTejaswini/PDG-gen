import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] a = scan.next().toCharArray();
		int[] alpha = new int[1000];
		for (int i = 0; i < a.length; i++) {
			alpha[a[i]]++;
			if (alpha[a[i]] > 1) {
				System.out.println("no");
				return;
			}
		}
		System.out.println("yes");
	}
}
