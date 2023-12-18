import java.util.*;

public class Main{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int Max=0;
		int[] A=new int[100001];

		A[0]=0;

		for(int i=1;i<=N;i++){
			A[i]=sc.nextInt();
			Max+=Math.abs(A[i]-A[i-1]);
		}
		A[N+1]=0;
		Max+=Math.abs(A[N+1]-A[N]);

		int ans=0;
		for(int i=1;i<=N;i++){
			ans=Max-(Math.abs(A[i]-A[i-1])+Math.abs(A[i+1]-A[i]))+Math.abs(A[i+1]-A[i-1]);
			//結果を出力
			System.out.println(ans);
			ans=Max;
		}
	}
} 