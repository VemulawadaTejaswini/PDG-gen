import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextInt();
		long m = scanner.nextInt();
		int ans = 1;
		if(Math.abs(n,m) >= 2){
			System.out.println(0);
		}else if (n == m) {
			for(int i = 1; i < n+1; i++){
				ans = (ans % 1000000007) * i;
			}
			System.out.println((ans*2) % 1000000007);
		}else {
			for(int i = 1; i < Math.max(n, m); i++){
				ans = (ans % 1000000007) * i;
			}
			System.out.println(ans * ans/(Math.max(n, m))%1000000007);
		}
	}
}
