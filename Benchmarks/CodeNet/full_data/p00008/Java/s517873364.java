import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 9; i > 0; i--) {
			for (int j = 9; j > 0; j--) {
				for (int k = 9; k > 0; k--) {
					for (int l = 9; l > 0; l--) {
						if (i + j + k + l == n) {
							sum++;
						}else if (i + j + k + l < n) {
							break;
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}