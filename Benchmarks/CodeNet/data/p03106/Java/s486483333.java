import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = gcd(sc.nextInt(), sc.nextInt());
		int num = sc.nextInt();
		int ans = a;
		for(int i = 1; i < num; ) {
			ans --;
			if(a % ans == 0) {
				i ++;
			}
		}
		System.out.println(ans);
	}
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}