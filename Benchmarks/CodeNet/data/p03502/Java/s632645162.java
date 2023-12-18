import java.util.Scanner;
public class Main {
	public static int sum(int a) {
		int ans = 0;
		while(a >= 10) {
			ans += a%10;
			a /= 10;
		}
		ans += a;
		return ans;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		
		if(N%sum(N) == 0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}