import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		int n = Integer.parseInt(a + b);
		int s = (int)Math.sqrt(n);
		if(s * s == n) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}