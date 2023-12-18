
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		int N = Integer.valueOf(n);
		String s = sc.nextLine();
		char[] ca = s.toCharArray();
		long count = 0;

		for (int i = 0; i < N; i++) {
			for (int j = i + 1 ; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					if ((k - j) != (j - i) && (ca[i] != ca[j]) 
							&& (ca[j] != ca[k]) && ca[k] != ca[i]) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
