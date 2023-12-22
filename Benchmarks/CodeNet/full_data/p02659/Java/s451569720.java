
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		double B = sc.nextDouble();
		long LB = (long)(B * 100);
		long ans = A * LB;
		ans /= 100L;
		System.out.println(ans);
		sc.close();
	}


}