
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int P=sc.nextInt();
		P += 3*A;
		int ans = P/2;
		System.out.println(ans);
		sc.close();
	}


}
