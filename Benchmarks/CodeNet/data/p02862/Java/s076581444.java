import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //BRUH
		Scanner input = new Scanner(System.in);
		long X = input.nextLong();
		long Y = input.nextLong();
		long ans = 0;
		long mod = (long)(1e9+7);
		long[][] fact = new long[1000001][2]; //[Factorial,Inverse]
		fact[1][0]=1; fact[1][1]=1;
		for (long i = 2; i <= 1000000; i++) {
			fact[(int) i][0]=fact[(int) (i-1)][0]*i;
			fact[(int) i][0]%=mod;
			fact[(int) i][1]=FastExp(fact[(int) i][0],mod-2,mod); //Fermat's little theorem
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
					ans=fact[(int) totalMoves][0];
					ans*=fact[(int) chooseOptions][1];
					ans%=mod;
					ans*=fact[(int) (totalMoves-chooseOptions)][1];
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