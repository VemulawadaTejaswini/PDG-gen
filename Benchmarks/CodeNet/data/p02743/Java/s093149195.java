import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		double rootA = Math.sqrt(a);
		double rootB = Math.sqrt(b);
		double rootC = Math.sqrt(c);
		
		String ans = rootA + rootB < rootC ? "Yes" : "No";
		System.out.println(ans);
		
		sc.close();
	}
}
