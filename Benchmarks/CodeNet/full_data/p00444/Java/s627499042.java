import java.util.*;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}
	
	private void run() {
		Scanner scan = new Scanner(System.in);
		int n;
		while (true) {
			n= scan.nextInt();
			if (n == 0) break;
			int exchange = 1000 - n;
			
			int[] coin = {500, 100, 50, 10, 5, 1};
			
			int count = 0;
			for (int i = 0; i < 6; i++) {
				int num = (int)Math.floor((double)exchange / coin[i]);
				exchange %= coin[i];
				count += num;
			}
			
			System.out.println(count);
		}
		
	}

}