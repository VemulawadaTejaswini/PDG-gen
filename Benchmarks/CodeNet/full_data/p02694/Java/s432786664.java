import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		sc.close();

		double p = 100.0;
		int cnt = 0;
		while (p < X) {
			p = Math.floor(p * 1.01);
			cnt++;
		}
		System.out.println(cnt);
	}
}
