import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(token.nextToken());
		int K = Integer.parseInt(token.nextToken());
		token = new StringTokenizer(br.readLine());
		int[] candles = new int[N];
		for(int i=0;i<N;i++) {
			candles[i] = Integer.parseInt(token.nextToken());
		}
		// 题目测试用例与题目要求不符
		int cnt = Integer.MAX_VALUE;
		int tmp = 0;
		for(int i=0, j=K-1;j<N;i++, j++) {
			cnt = Math.min(cnt, candles[j] - candles[i] + Math.min(Math.abs(candles[i]), Math.abs(candles[j])));
		}
		System.out.println(cnt);
	}
}