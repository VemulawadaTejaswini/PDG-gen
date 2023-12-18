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
		int count=0;
		//処理
		Arrays.sort(h);
		//System.out.println(Arrays.toString(h));
		int j=K-1;
		for(int i=0;i<N-j;i++)
		{
			//System.out.println("asdafsd"+i);
			//System.out.println(h[i+j]);
			//System.out.println(h[i]);
			sum=h[i+j]-h[i];
			//System.out.println(sum);
			min=Math.min(sum,min);
			//count++;
			//System.out.println(count);
		}
		// 出力
		//System.out.println(Arrays.toString(h));
		System.out.println(min);
	}
}