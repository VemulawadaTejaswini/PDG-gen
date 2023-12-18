import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans = 0;
		int outlet = 1;

		while (B < outlet) {
			outlet--;
			outlet += A;
			ans++;
		}
		System.out.println(ans);
	}
}