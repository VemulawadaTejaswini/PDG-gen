import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		
		int num = 0;
		for (int i = 0; i < 9; i++) {
			
			num += 7 * (int) Math.pow(10, i);
			
			if (num % k == 0) {
				System.out.println(i + 1);
				return;
			}
			
		}
			
		System.out.println(-1);
		return;
	}
}
