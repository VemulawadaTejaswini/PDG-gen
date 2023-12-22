import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj1172().doIt();
	}
	class aoj1172{
		int prime[] = new int [300001];
		boolean is_prime[] = new boolean [300002];
		void sieve(int n){
			int p = 0;
			for(int i  =0;i <= n;i++) is_prime[i] = true;
			is_prime[0] = is_prime[1] = false;
			for(int i = 2;i < n;i++){
				if(is_prime[i]){
					prime[p++] = i;
					for(int j = 2 * i;j <= n;j += i)is_prime[j] = false;
				}
			}
 		}
		void doIt() {
			sieve(300000);
			while (true) {
				int n = sc.nextInt();
				if(n == 0)break;
				int ans = 0;
				for(int i = n + 1;i <= 2*n;i++){
					if(is_prime[i])ans++;
				}
				System.out.println(ans);
			}
		}
	}
}