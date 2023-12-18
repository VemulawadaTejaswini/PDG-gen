import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int want = sc.nextInt();
		int count = 0;
		for(int i = 0; i <= k; i++) {
			for(int m = i; m <= k; m++) {
				if(want - i - m <= k) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}