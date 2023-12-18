import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int want = sc.nextInt();
		int count = 0;
		for(int i = 0; i <= Math.min(k, want); i++) {
			for(int m = 0; m <= Math.min(k, want); m++) {
				for(int j = 0; j <= Math.min(k, want); j++) {
					if(i + m + j == want) count++;
				}
			}
		}
		System.out.println(count);
	}
}