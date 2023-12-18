import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int n = Integer.parseInt(tmpArray[0]);
		long c = Long.parseLong(tmpArray[1]);
		
//		long benefit[] = new long[n];
		
		Sushi sushi[] = new Sushi[n];
//		long prePos = 0;
		for(int i = 0; i < n; i++){
			tmpArray = br.readLine().split(" ");
			
			long tmp1 = Long.parseLong(tmpArray[0]);
			int tmp2 = Integer.parseInt(tmpArray[1]);
			
//			benefit[i] = tmp2 - (tmp1 - prePos);
//			prePos = tmp1;
			sushi[i] = new Sushi(tmp1, tmp2);
//			System.out.println(benefit[i]);
		}
		
		System.out.println(solve(sushi, c));
	}
	
	static long solve(Sushi[] sushi, long c){
		//方向転換は高々1回で十分？
		
		int n = sushi.length;
		
		long watchDir[] = new long[n + 1];
		
		//時計回りの場合
		for(int i = 1; i <= n; i++){
			if(i == 1){
				watchDir[i] = sushi[i - 1].cal - sushi[i - 1].pos;
			}
			else {
				watchDir[i] = watchDir[i - 1] + sushi[i - 1].cal - (sushi[i - 1].pos - sushi[i - 2].pos);
			}
			
//			System.out.println(watchDir[i]);
		}
		
		//半時計回りの場合
		long antiWatchDir[] = new long[n];
		long dp[] = new long[n];
		for(int i = 0; i < n; i++){
			if(i == 0){
				antiWatchDir[i] = sushi[n - i - 1].cal - (c - sushi[n - 1 - i].pos);
				dp[i] = Math.max(0, antiWatchDir[i]);
			}
			else {
				antiWatchDir[i] = antiWatchDir[i - 1] + sushi[n - i - 1].cal 
						- (sushi[n - i].pos - sushi[n - i - 1].pos);
				dp[i] = Math.max(antiWatchDir[i], dp[i - 1]);
			}
			
//			System.out.println("dp"+i+" "+dp[i]);
			
//			System.out.println(antiWatchDir[i]);
		}

		
//		Arrays.fill(dp, Long.MAX_VALUE);
		
		long max = 0;
		
		//i回目で引き返すという考え方
		for(int i = 0; i <= n; i++){
			long tmpCal = watchDir[i];
			
			if(i == 0){
				tmpCal += dp[n - 1];
			}
			else if(i <= n - 1 && dp[n - i - 1] - sushi[i - 1].pos > 0){
				tmpCal += dp[n - i - 1];
				if(i >= 1){
					tmpCal -= sushi[i - 1].pos;
				}
			}
//			if(i <= n - 1 && dp[n - i - 1] > 0){
//				tmpCal += dp[n - i - 1];
//			}
//			if(i >= 1 && i != n && dp[n - i - 1] > 0){
//				tmpCal -= sushi[i - 1].pos;
//			}
			
//			System.out.println("i = "+i+" tmpCal = "+tmpCal);
			if(tmpCal > max){
				max = tmpCal;
			}
		}
		return max;
	}

}

class Sushi{
	long pos;
	int cal;
	
	public Sushi(long pos, int cal){
		this.pos = pos;
		this.cal = cal;
	}
}
