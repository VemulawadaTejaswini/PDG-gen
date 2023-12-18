import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//入力
		int N = sc.nextInt();
		int K=sc.nextInt();
		int h[]=new int[N];
		for(int i=0;i<N;i++)
		{
			h[i]=sc.nextInt();
		}
		//変数
		int answer=0;
		int center=N/2;
		int sum=0;
		int min=10*9+1;
		int beforeMin=10*9+2;
		//処理
		Arrays.sort(h);
		for(int i=1;i<N-1;i++)
		{
			int jo=Math.max(h[i-1],h[i]);
			int jt=Math.min(h[i-1],h[i]);
			int ko=Math.max(h[i-1],h[i]);
			int kt=Math.min(h[i-1],h[i]); 
			sum=(jo-jt)+(ko-kt);
			min=Math.min(sum,min);
		}
		// 出力
		System.out.println(min);
		//System.out.println(answer);
	}
}