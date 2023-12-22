import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		int[] prime = new int[50000];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = 1;
		}
		
		for (int i = 2; i < (prime.length / 2); i++) {
			for (int j = 2; (i * j) < prime.length; j++) {
				prime[i * j] = 0;
			}
		}
		prime[0] = 0;
		prime[1] = 0;
		
		int num = Integer.parseInt(sc.nextLine());
		while (num != 0) {
			int sum = 0;
			for (int i = 2; i <= (num / 2); i++) {
				if ((prime[i] == 1) && (prime[num - i] == 1)) sum++;
			}
			System.out.println(sum);
			
			num = Integer.parseInt(sc.nextLine());
		}
	}
}