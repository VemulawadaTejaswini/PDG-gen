import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N,M,MIN;
	static int[] candles;
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		long startTime = new Date().getTime();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.valueOf(st.nextToken());
		M = Integer.valueOf(st.nextToken());
		
		candles = new int[N+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			int zb =  Integer.valueOf(st.nextToken());
			candles[i] = zb;
		}
		
		for(int i=0;i<N-M+1;i++) {
			int total = 0;
			for(int j=0;j<M-1;j++) {
				total += candles[i+j+1] - candles[i+j];
			}
//			System.out.println("total1:"+total);
			if(candles[i]>=0) {//第一个数都大于0
				total += candles[i];
			}else if(candles[i+M-1]<=0) {//最后一个数小于0
				total += Math.abs(candles[i+M]);
			}else {//跨越0点
				int left = Math.abs(candles[i]);
				int right = candles[i+M-1];
//				System.out.println("left:"+left+" right:"+right);
				total += left>right?right:left;
			}
//			System.out.println("total2:"+total);
			if(MIN==0) {
				MIN = total;
			}else {
				if(total<MIN) {
					MIN = total;
				}
			}
		}
		
		
//		long endTime = new Date().getTime();
//		System.out.println((endTime-startTime)/1000);
		System.out.println(MIN);
		
	}
	
	public static void circle() {
		
	}
	
}
