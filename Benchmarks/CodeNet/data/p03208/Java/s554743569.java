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
		int a=0;
		int b=0;
		int sum=0;
		int min=10*9+1;
		int beforeMin=10*9+2;
		//処理
		Arrays.sort(h);
		if(K%2==0)
		{
			a=K/2-1;
			b=K/2;;
		}else if(K%2==1)
		{
			a=K/2;
			b=K/2;
		}
		for(int i=a;i<N-b;i++)
		{
			int jo=Math.max(h[i-a],h[i]);
			int jt=Math.min(h[i-a],h[i]);
			int ko=Math.max(h[i+b],h[i]);
			int kt=Math.min(h[i+b],h[i]); 
			sum=(jo-jt)+(ko-kt);
			min=Math.min(sum,min);
		}
		// 出力
		//System.out.println(Arrays.toString(h));
		System.out.println(min);
	}
}