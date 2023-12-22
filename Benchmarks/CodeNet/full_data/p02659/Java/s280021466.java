import java.util.Scanner;
 
public class Main {
	public static long gcd(long a, long b) {
		if (a%b ==0)  {
			return b;
		} else {
			return gcd(b, a%b);
		}
	}

	public static long lcm(long a, long b) {
		return a*b/gcd(a,b);
	}

	public static long digit(long a) {
		Long d = 0L;
		while(a!=0) {
			a/=10;
			d++;
		}
		return d;
	}

	public static long mod_pow(long base, long exp, long mod) {
		if(exp == 1) return base%mod;
		if(exp%2 == 1) return (base*mod_pow(base, exp-1, mod))%mod;
		Long t = mod_pow(base, exp/2, mod);
		return (t*t)%mod;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Double b = sc.nextDouble();
		System.out.println(Math.round(Math.floor(a*b)));

		// long sum = 0;
		// for(int i=0; i<n.length();i++){
		// 	if(n.charAt(i) == 'U') {
		// 		sum+=(n.length() - i - 1);
		// 		sum+=i*2;
		// 	} else {
		// 		sum+=(n.length() - i - 1)*2;
		// 		sum+=i;
		// 	}
		// }
		// System.out.println(sum);

 
		//1か2のどちらかしかない？
		//pos=U->上の回は1回/下の回は2回
		//pos=D->上の回は2回/下の回は1回
		//UUDUUDUD = 8
		//pos=1 -> (8-1)*1 + (1-1)*2 = 7
		//pos=2 -> (8-2)*1 + (2-1)*2 = 8
		//pos=3 -> (8-3)*2 + (3-1)*1 = 12
		//pos=4 -> (8-4)*1 + (4-1)*2 = 10
		//pos=5 -> (8-5)*1 + (5-1)*2 = 11
		//pos=6 -> (8-6)*2 + (6-1)*1 = 9
		//pos=7 -> (8-7)*1 + (7-1)*2 = 13
		//pos=8 -> (8-8)*2 + (8-1)*1 = 7

		
	}
}