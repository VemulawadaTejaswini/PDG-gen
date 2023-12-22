
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		boolean[] b = new boolean[300001];
		while (n-- > 0) {
			b[scanner.nextInt()] = true;
		}
		loop:
		while (q-- > 0) {
			int m = scanner.nextInt();
			for (int res = m - 1; res > 0; res--) {
				for(int i = res;i<=300000;i+=m){
					if(b[i]){
						System.out.println(res);
						continue loop;
					}
				}
			}
		}
	}
}