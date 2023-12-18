import java.util.*;

public class Main{
	static final long MOD = 1000000007L;
	static final int WIDTH = 64;
	static final long[] BIN_EXPS = buildBinExps();
	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	
	public static void main(String[] args){
		/*System.out.print("[ ");
		for(int i = 0; i < WIDTH; ++i){
			System.out.print(BIN_EXPS[i] + " ");
		}
		System.out.println("]");*/
		
		n = sc.nextInt();
		int[][] binaries = new int[n][WIDTH];
		for(int i = 0; i < n; ++i){
			long a = sc.nextLong();
			binaries[i] = getBinary(a);
		}
		
		long ans = 0;
		for(int iw = 0; iw < WIDTH; ++iw){
			int z = count0(binaries, iw);
			ans = (ans + z * (n - z) % MOD * BIN_EXPS[iw] % MOD) % MOD;
		}
		System.out.println(ans);
	}
	
	static long[] buildBinExps(){
		long[] res = new long[WIDTH];
		for(int i = 0; i < WIDTH; ++i){
			res[i] = (i == 0) ? 1L : 2L * res[i - 1] % MOD;
		}
		return res;
	}
	
	static int[] getBinary(long num){
		int[] res = new int[WIDTH];
		for(int i = 0; i < WIDTH; ++i){
			res[i] = (num % 2L == 1L) ? 1 : 0;
			num /= 2L;
		}
		return res;
	}
	
	static int count0(int[][] binaries, int iw){
		int res = 0;
		for(int id = 0; id < n; ++id){
			if(binaries[id][iw] == 0) ++res;
		}
		return res;
	}
}