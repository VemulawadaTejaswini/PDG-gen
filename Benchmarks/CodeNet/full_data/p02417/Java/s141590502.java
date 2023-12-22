import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alphabetSize = 'z' - 'a';
		int alphabet = 'a';
		int difference = 'A' - 'a';
		int[] count = new int[alphabetSize + 1];
		String x;
		x = sc.nextLine();
		char[] c = x.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < alphabetSize; j++) {
				if ((int) c[i] == alphabet + j || (int) c[i] == alphabet + difference + j) {
					count[j]++;
				}
			}
		}
		for (int i = 0; i <= alphabetSize; i++) {
			System.out.println((char) (alphabet + i) + " : " + count[i]);
		}
		sc.close();
	}
}
