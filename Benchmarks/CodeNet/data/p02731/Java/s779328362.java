import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		
		int max = 0;
		for (int i = 1; i <= l - 2; i++) {
			for (int j = 1; i + j <= l - 1; j++) {
				int k = l - i - j;
				int vol = i * j * k;
				max = Math.max(max, vol);
			}
		}
		
		System.out.println(max);
	}
}
