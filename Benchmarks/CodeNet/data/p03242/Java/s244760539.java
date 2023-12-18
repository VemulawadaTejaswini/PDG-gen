import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] n = sc.next().toCharArray();
		for (int i = 0; i < n.length; i++) {
			if (n[i] == '1') {
				n[i] = '9';
			} else if (n[i] == '9') {
				n[i] = '1';
			}
		}
		System.out.println(String.valueOf(n));
	}
}