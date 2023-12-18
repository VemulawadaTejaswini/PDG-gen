import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = a/500;
		long c = a%500/5;
		long result = 1000 * b + 5 * c;
		System.out.println(result);
	}

}
