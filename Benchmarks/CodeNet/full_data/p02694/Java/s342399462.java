import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double X = sc.nextDouble();

		int cnt = 0;
		double tmp = 100.0;
		while (tmp<X) {
			cnt++;
			tmp *= 1.01;
			tmp = Math.floor(tmp);
		}
		System.out.println(cnt);
	}
}