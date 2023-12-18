import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		long ans = 0;
		for(int i = 1 ; i <= n ; i++) {
			if(func(i, a, b)) {
				ans += i;
			}
		}
		System.out.println(ans);
	}

	public static boolean func(int value, int a, int b) {
		long ret = 0;
		while(value > 0) {
			ret += value % 10;
			value /= 10;
		}
		if(a <= ret && ret <= b) {
			return true;
		} else {
			return false;
		}
	}

}
