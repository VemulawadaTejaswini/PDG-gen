import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int n,W;
	static long memo[][];
	static final int uncalc = -1;
	static ArrayList<Integer> w ,v;
	static long dp (int i,int remW){
		if(i==n)return 0;
		if(memo[i][remW]!=uncalc)
			return memo[i][remW];
		long leave = dp(i+1,remW);
		long take = 0;
		if(remW>=w.get(i)) take = dp(i+1,remW-w.get(i))+v.get(i);
		memo[i][remW]=Math.max(take, leave);
		return memo[i][remW];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader axa = new BufferedReader(new InputStreamReader(System.in));
		String[] x = axa.readLine().split(" ");
		n = Integer.parseInt(x[0]);
		W = Integer.parseInt(x[1]);
		v = new ArrayList<>();
		w = new ArrayList<>();
		memo = new long [n][W+1];
		for(long [] a : memo)
			Arrays.fill(a, -1);
		for (int i = 0; i < n; i++) {
			String[] tem = axa.readLine().split(" ");
			v.add(Integer.parseInt(tem[1]));
			w.add(Integer.parseInt(tem[0]));
		}
		System.out.println(dp(0,W));
		
	}

}
