import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		sc.close();
		
		long ans = calc(B)^calc(A-1);
		
		System.out.println(ans);
		}
	
	static long calc(long a) {
		int N=50;
		
		long ans=0;
		
		//iは桁数（二進数）
		for(int i=0;i<N;i++) {
			//同じ塊('000111'、'000111')が出てくる周期
			long period = 1L<<i+1;
			
			long times = (a+1)/period; //周期の回数 切り捨てでOK
			
			long cnt=0;//1の現れる回数
			
			cnt += times*(period/2);
			
			//周期からはみ出た部分の１の数を加える。
			
			long rem = (a+1)%period;
			
			cnt += Math.max(0, rem-period/2);		
			
			if(cnt%2==1)ans += Math.pow(2, i);
		}
		
		return ans;
	}
}