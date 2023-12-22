import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int mod = 1000000007;
		int ans = 1;
		
		if(n == 1) {
			System.out.println(0);
		}else {
			for(int i=n;i>1;i--) {
				ans *= i;
				ans %= mod;
			}
			System.out.println(ans);
		}

	}

}
