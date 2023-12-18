import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int K = input.nextInt();
		long mod = (long)(1e9+7);
		long[] gcdPerNum = new long[K+1];
		long answer = 0;
		for (int curGCD = K; curGCD>=1; curGCD--) {
			long base = K/curGCD;
			gcdPerNum[curGCD] = FastExp(base,N,mod);
			for (int OVERCNT = 2*curGCD; OVERCNT <= K; OVERCNT+=curGCD) {
				gcdPerNum[curGCD]-=gcdPerNum[OVERCNT];
				gcdPerNum[curGCD]%=mod;
				if (gcdPerNum[curGCD]<0) gcdPerNum[curGCD]+=mod;
			}
			answer+=gcdPerNum[curGCD]*curGCD;
			answer%=mod;
		}
		System.out.println(answer);
	}
	public static long FastExp(long base, long exp, long mod) {
		String Binary = Binary(exp);
		long[] mods = new long[Binary.length()];
		mods[0] = base%mod;
		long FinalProduct = 1;
		for (int i = 1; i < mods.length; i++) {
			mods[i] = ((mods[i-1]%mod)*(mods[i-1]%mod))%mod;
		}
		for (int i = 0; i < Binary.length(); i++) {
			if (Binary.charAt(i)=='1') {
				FinalProduct*=mods[Binary.length()-i-1];
				FinalProduct%=mod;
			}
		}
		return FinalProduct;
	}
	public static String Binary(long exp) {
		String answer = "";
		int length = 0;
		for (int i = 0;;i++) {
			if (Math.pow(2, i)>exp) {
				length=i;
				break;
			}
		}
		for (int i = length-1; i >= 0; i--) {
			if (Math.pow(2, i)<=exp) {
				answer+="1";
				exp-=Math.pow(2, i);
			}else {
				answer+="0";
			}
		}
		return answer;
	}
}
