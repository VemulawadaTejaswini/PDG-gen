
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = Math.min(n*a, b);
		System.out.println(ans);
		sc.close();
		
	}
}
