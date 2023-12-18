import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long mod = 998244353;
		long[] depthCnt = new long[N+1]; 
		int max = 0;
		long START = -1;
		long numZero = 0;
		for (int i = 0; i < N; i++) {
			int x = input.nextInt();
			if (i==0) START=x;
			if (x==0) numZero++;
			depthCnt[x]++;
			max=Math.max(max, x);
		}
		if (START==0&&numZero==1) { //Vertex 1 cannot be treated generically since it is the root 
			//node in this problem AND V1 is the only allowed with 0
			long ans = 1;
			for (int depth = 1; depth <= max; depth++){ //Starting from 1 since depth 0 must always 
				//be predecessor
				long numPrev = depthCnt[depth-1]; //Base of exponent
				long numCur = depthCnt[depth]; //Power of exponent
				long curans = FastExp(numPrev,numCur,mod);
				ans*=curans;
				ans%=mod;
			} 
			System.out.println(ans);
		}else System.out.println(0);
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
