
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] record = new int[n];
		for (int i = 0; i < record.length; i++) {
			record[i] = sc.nextInt();
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < record.length; j++) {
				if (record[j] == i) {
					System.out.print(j + 1 + " ");
				}
			}
		}
		System.out.println();
		
	}
}