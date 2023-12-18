import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //Modular inverse of a is a^(mod-2)%mod
		Scanner input = new Scanner(System.in);
		long X = input.nextLong();
		long Y = input.nextLong();
		long ans = 0;
		long mod = (long)(1e9+7);
		long[] fact = new long[1000001]; //[Factorial,Inverse]
		fact[1]=1;
		for (long i = 2; i <= 1000000; i++) {
			fact[(int) i]=fact[(int) (i-1)]*i;
			fact[(int) i]%=mod;
		}
		if ((X+Y)%3==0) {
			long min = Math.min(X, Y);
			long max = Math.max(X, Y);
			if (max<=min*2) {
				if (max==min*2) ans=1;
				else {
					long diff = max-min;
					long sub = min-diff;
					long totalMoves = sub/3; //Each move increases sum of coordinates by 3
					totalMoves*=2; //Each move alters x AND y though so need to 
					//multiply by 2 to avoid WA
					max-=sub;
					min-=sub;
					totalMoves+=min;
					long chooseOptions = sub/3;//(3,3) requires one of each knight move
					long inv1 = FastExp(fact[(int) chooseOptions],mod-2,mod);
					long inv2 = FastExp(fact[(int) (totalMoves-chooseOptions)],mod-2,mod);
					ans=fact[(int) totalMoves];
					ans*=inv1;
					ans%=mod;
					ans*=inv2;
					ans%=mod;
				}
			}
		}
		System.out.println(ans);
	}	
	public static long FastExp(long base, long exp, long mod) {
		long ans = 1;
		while (exp>0) {
			if (exp%2==1) ans*=base;
			base*=base;
			exp/=2;
			base%=mod;
			ans%=mod;
		}
		return ans;
	}
}