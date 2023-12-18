import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.nio.LongBuffer;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int A = Integer.parseInt(strs[1]);
		strs = br.readLine().split(" ");
		int[] card = new int[N];
		for(int i = 0 ; i < N ; i++){
			card[i] = Integer.parseInt(strs[i]);
		}
		long lp = (long)1 << N;
		long result = 0;
		for(long x = 1 ; x < lp ; x++){
			long sum = 0;
			long ct = 0;
			long[] xx = new long[1];
			xx[0] = x;
			BitSet X = BitSet.valueOf(xx);
			for(int i = 0 ; i < N ; i++){
				if(X.get(i)){
					sum += card[i];
					ct++;
				}
			}
			long ave = sum / ct;
			if(ave == A && sum%ct == 0)
				result++;
		}
		
		System.out.println(result);
	}
}
