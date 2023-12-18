import java.util.*;
public class Main {

	public static void main(String[] args) {		

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long C = sc.nextLong();
		long sushi[][] = new long[N][2];		
		for(int i=0;i<N;i++) {
			sushi[i][0] = sc.nextLong();//dist x
			sushi[i][1] = sc.nextLong();//calorie v
		}
		sc.close();
		
		Arrays.sort(sushi, (s1,s2)->Long.compare(s1[0], s2[0]));
		
		//右回りのcalorie累積和
		long sumVR[] = new long[N+1];
		sumVR[0]=0;
		for(int i=0;i<N;i++)sumVR[i+1] = sumVR[i]+sushi[i][1];
		//x累積和
		long sumXR[] = new long[N+1];
		sumXR[0] = 0;
		for(int i=0;i<N;i++) sumXR[i+1] = sushi[i][0];
		
		//左回りのcalorie累積和
		long sumVL[] = new long[N+1];
		sumVL[0]=0;
		for(int i=0;i<N;i++)sumVL[i+1] = sumVL[i]+sushi[N-1-i][1];
		//x累積和
		long sumXL[] = new long[N+1];
		sumXL[0] = 0;
		for(int i=0;i<N;i++) sumXL[i+1] = C - sushi[N-1-i][0];
		
		
		//右回りの累積Max（戻る場合）
		long sumR2[] = new long[N+1];
		sumR2[0]=0;
		for(int i=1;i<N+1;i++) {
			sumR2[i] = Math.max(sumR2[i-1], sumVR[i] - 2*sumXR[i]);
		}
		//右回りの累積Max（戻らない場合）
		long sumR1[] = new long[N+1];
		sumR1[0]=0;
		for(int i=1;i<N+1;i++) {
			sumR1[i] = Math.max(sumR1[i-1], sumVR[i] - sumXR[i]);
		}
		//左回りの累積Max（戻る場合）
		long sumL2[] = new long[N+1];
		sumL2[0]=0;
		for(int i=1;i<N+1;i++) {
			sumL2[i] = Math.max(sumL2[i-1], sumVL[i] - 2*sumXL[i]);
		}
		//左回りの累積（戻らない場合）
		long sumL1[] = new long[N+1]; 
		sumL1[0]=0;
		for(int i=1;i<N+1;i++) {
			sumL1[i] = Math.max(sumL1[i-1],sumVL[i] - sumXL[i]);
		}		

		
		long ans = 0;
		for(int i=0;i<N;i++) {
			long tmp = sumR2[i]+sumL1[N-i];
			long tmp2 = sumL2[i]+sumR1[N-i];
			long tmpMax = Math.max(tmp, tmp2);
			ans = Math.max(ans,tmpMax);
		}
		
		System.out.println(ans);
		
	}

	
}