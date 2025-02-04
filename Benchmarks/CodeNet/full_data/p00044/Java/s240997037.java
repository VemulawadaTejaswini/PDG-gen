import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);


		int[] prime = new int[51000];
		for (int i = 0; i < prime.length; i++) {
			prime[i] = 1;
		}
		
		for (int i = 2; i < Math.sqrt(prime.length); i++) {
			for (int j = 2; (i * j) < prime.length; j++) {
				prime[i * j] = 0;
			}
		}
		prime[0] = 0;
		prime[1] = 0;
		prime[2] = 1;
		
		while (sc.hasNextLine()) {
			int num = Integer.parseInt(sc.nextLine());
			
			int tmp = num - 2;
			while (prime[tmp] == 0) {
				tmp = tmp - 2;
				if (tmp < 0) break;
			}
			System.out.print(tmp + " ");
			
			tmp = num + 2;
			while (prime[tmp] == 0) {
				tmp = tmp + 2;
				if (tmp >= prime.length) break;
			}
			System.out.println(tmp);
		}
	}
}