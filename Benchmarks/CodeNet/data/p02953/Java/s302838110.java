import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] n = new int[scan.nextInt()];
		String str = "Yes";
		for (int i = 0; i < n.length; i++) {
			n[i] = scan.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = i; j < n.length; j++) {
				if (j == n.length - 1) {
					break;
				}
				if (n[i] - n[j + 1] >= 2) {
					str = "No";
				}
			}
		}
		System.out.println(str);

	}
}