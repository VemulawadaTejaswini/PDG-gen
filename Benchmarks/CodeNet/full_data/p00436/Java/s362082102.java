import java.util.Scanner;

public class Main {
	private int[] card;
	private int[] temp;

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		card = new int [2 * n];
		temp = new int [n];
		
		for (int i = 0; i < 2 * n; i++) {
			card[i] = i + 1;
		}
		
		int m = scan.nextInt();
		int command;
		for (int i = 0; i < m; i++) {
			command = scan.nextInt();
			if (command == 0) {
				reFull(n);
			}else {
				cut(command, n);
			}
			//disp(n);
		}
		
		disp(n);
	}
	
	private void reFull(int n) {
		cardTemp(n, n);
		for (int i = n - 1; i > -1; i--) {
			card[i * 2] = card[i];
		}
		for (int i = 0; i < n; i++) {
			card[i * 2 + 1] = temp[i];
		}
	}
	
	private void cut(int k, int n) {
		if (k <= n) {
			cardTemp(0, k);
			for (int i = 0; i < 2 * n - k; i++) {
				card[i] = card[i + k];
			}
			for (int i = 0; i < k; i++) {
				card[2 * n - k + i] = temp[i];
			}
		}else {
			cardTemp(k, 2 * n - k);
			for (int i = 2 * n - 1; i > 2 * n + 1 - k; i--) {
				card[i] = card[i - k];
			}
			for (int i = 0; i < 2 * n - k; i++) {
				card[k + i] = temp[i];
			}
		}
		
	}
	
	private void cardTemp(int begin, int k) {
		for (int i = begin; i < k + begin; i++) {
			temp[i-begin] = card[i];
		}
	}
	
	private void disp(int n){
		for (int i = 0; i < 2 * n; i++) {
			System.out.println(card[i]);
		}
	}

}