import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] lines = sc.nextLine().toLowerCase().toCharArray();
		sc.close();
		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
				'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
				'w', 'x', 'y', 'z' };
		int[] count = new int[alphabet.length];
		for (char c : lines) {
			for (int i=0; i<alphabet.length; i++) {
				if (c == alphabet[i]) {
					count[i]++;
				}
			}
		}
		for (int i=0; i<alphabet.length; i++) {
			System.out.println(alphabet[i] + " : " + count[i]);
		}
	}
}