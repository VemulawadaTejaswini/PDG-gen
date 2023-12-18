import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % func(n) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static int func(int x) {
		int ret = 0;
		while(x > 0) {
			ret += x % 10;
			x /= 10;
		}
		return ret;
	}

}
