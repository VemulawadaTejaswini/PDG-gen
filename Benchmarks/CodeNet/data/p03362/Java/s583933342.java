import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 2; i <= 55555; i++) {
			if (i % 5 == 1 && isPrime(i)) {
				if (count != 0) {
					sb.append(" ");
				}
				sb.append(i);
				count++;
				if (count >= n) {
					break;
				}
			}
		}
		System.out.println(sb);
	}
	
	static boolean isPrime(int x) {
		for (int i = 2; i * i <= x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
