
import java.util.Scanner;

public class Main {
	public static long MOD = 1_000_000_007L;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int w = sc.nextInt();
		long bunbo = 1;
		long allB = 0; //(i-1)CW+...+(i-1)C(i-1) at end
		long allW = 0; //(i-1)CB+...+(i-1)C(i-1) at end
		long tmp1 = 0; //(i-1)C(W-1) at end
		long tmp2 = 0; //(i-1)C(B-1) at end
		for (int i=1;i<=b+w;i++) {

			allB = (allB*2+tmp1)%MOD;
			allW = (allW*2+tmp2)%MOD;

			//System.out.println(allB+" "+allW);
			System.out.println(div((bunbo+allB-allW+MOD)%MOD, bunbo*2%MOD));
			
			//System.out.println(bunbo+allB-allW+" "+bunbo*2);
			
			tmp1 = (i-1>w-1)? div(tmp1*(i-1),i-1-w+1) : (i-1==w-1)? 1 : 0;
			tmp2 = (i-1>b-1)? div(tmp2*(i-1),i-1-b+1) : (i-1==b-1)? 1 : 0;
			
			//System.out.println(tmp1+" "+tmp2);
			bunbo = bunbo*2%MOD;
			
			
		}
	}
	public static long pow (long a, long b) {
		if (b==0) {
			return 1;
		} else if (b%2==0) {
			long tmp = pow(a,b/2);
			return tmp * tmp % MOD;
		} else  {
			long tmp = pow(a,b/2);
			return (tmp * tmp % MOD)*(a%MOD)%MOD;
		}
	}
	public static long div  (long a, long b) {
		return ((a%MOD) * pow(b, MOD-2))%MOD;
	}

}
