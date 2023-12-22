import java.util.*;
class Main{
	static long mod = 100000000 + 7;
	public static long mod(long num,long a) {
		long p = 1;
		for(int i = 0; i < num; i++) {
			p = p*a%mod;
		}
		return p;
	}
	public static void main(String[] args) {
		System.out.println(mod);
		Scanner scanner = new Scanner(System.in);
		long num = scanner.nextInt();
		long result = 0;
		result = (mod(num,10) - 2*mod(num,9) + mod(num,8))%mod;
		result = (result + mod)%mod;
		System.out.println(result);
		scanner.close();
	}
}