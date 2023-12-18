import java.util.Scanner;

public class Main {
	public static long MOD = 1000000007l;
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int w = sc.nextInt();
		long bunbo = 1;
		long allB = 0;
		long allW = 0;
		long tmp1 = 0;
		long tmp2 = 0;
		for (int i=1;i<=b+w;i++) {
			allB = (allB*2+tmp1)%MOD;
			allW = (allW*2+tmp2)%MOD;
			System.out.println(div((bunbo+allB-allW+MOD)%MOD, bunbo*2%MOD));
			tmp1 = (i-1>w-1)? div(tmp1*(i-1),i-1-w+1) : (i-1==w-1)? 1 : 0;
			tmp2 = (i-1>b-1)? div(tmp2*(i-1),i-1-b+1) : (i-1==b-1)? 1 : 0;
			bunbo = bunbo*2%MOD;
		}
	}
	public static long pow (long a, long b) {
		if (b==0) {
			return 1;
		} else if (b%2==0) {
			long tmp = pow(a,b/2);
			return tmp * tmp % MOD;
		} else {
			long tmp = pow(a,b/2);
			return (tmp * tmp % MOD)*(a%MOD)%MOD;
		}
	}
	public static long div (long a, long b) {
		return ((a%MOD) * pow(b, MOD-2))%MOD;
	}
}