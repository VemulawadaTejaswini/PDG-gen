
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		long lb = Math.round(b*100);
		long ans = a*lb/100;
		System.out.println(ans);
		sc.close();
	}


}