
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int D = sc.nextInt();
		long x = sc.nextLong();

		for(int i=0; i<10; i++) {
			x = r * x - D;
			System.out.println(x);
		}

		sc.close();
	}
}
