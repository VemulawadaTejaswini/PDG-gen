
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long ans = (long)Math.pow(2, m) * (1900 * m + 100 *(n-m));
		System.out.println(ans);
		sc.close();
	}
}
