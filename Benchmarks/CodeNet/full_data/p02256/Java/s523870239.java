import java.util.Scanner;
public class Main {
	
	public static int getGcd(int a, int b) {
		if (a == b)
			return b;
		int bigger = Math.max(a, b);
		int smaller = Math.min(a, b);
		int modded = bigger % smaller;
		if (modded == 0)
			return smaller;
		return getGcd(smaller, bigger % smaller);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int result = getGcd(a, b);
		System.out.println(result);
	}
}
