
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main{
//	static int[][] memo = new int[][];

//	public static Pair<Integer, Long> dp(int[] weights, long[] values, int i, int N, int W) {
//		if (i >= N)
//			return new Pair(0, 0L);
//		Pair<Integer, Long> p = dp(weights, values, i + 1, N, W);
//		int takeWeight = weights[i] + p.getKey();
//		long takeValue = values[i] + p.getValue();
//		int leaveWeight = p.getKey();
//		long leaveValue = p.getValue();
//		if (takeWeight > W) {
//			takeValue = 0;
//			takeWeight = 0;
//		}
//		if (leaveWeight > W) {
//			leaveValue = 0;
//			leaveWeight = 0;
//		}
//		System.out.println((takeValue > leaveValue)? takeValue:leaveValue);
//		return (takeValue > leaveValue)? new Pair<Integer, Long>(takeWeight, takeValue) : new Pair<Integer, Long>(leaveWeight, leaveValue);
//	}
	public static long dp2(int[] weights, long[] values, int i, int N, int W, int curW) {
		if(i>=N || curW>W)
			return 0;
		long take = values[i]+dp2(weights,values,i+1,N,W,curW+weights[i]);
		if(weights[i]+curW>W)
			take = -1;
		long leave = dp2(weights,values,i+1,N,W,curW);
		return (take>leave)?take:leave;
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		int w;
		long v;
		int[] weights = new int[N];
		long[] values = new long[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			v = Long.parseLong(st.nextToken());
			weights[i] = w;
			values[i] = v;
		}
//		System.out.println(dp(weights, values, 0, N, W).getValue());
		System.out.println(dp2(weights, values, 0, N, W,0));
	}

}
