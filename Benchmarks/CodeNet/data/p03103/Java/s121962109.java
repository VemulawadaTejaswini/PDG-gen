import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		long answer=0;
		//List<Integer> h=new ArrayList<Integer>();
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		//int h[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		//List<Integer> A=new ArrayList<Integer>();
		//for(int i=0;i<M;i++)
		//{
		//	A.add(sc.nextInt());
		//}
		Long a[][]=new Long[N][2];
		for(int i=0;i<N;i++)
		{
			a[i][0]=sc.nextLong();
			a[i][1]=sc.nextLong();
		}
		Arrays.sort(a,(x,y) -> Long.compare(x[0], y[0]));
		//System.out.println(Arrays.deepToString(a));
		//処理
		for(int i=0;i<N;i++)
		{
			if(M-a[i][1]>=0)
			{
				answer+=a[i][0]*a[i][1];
				M-=a[i][1];
			}else
			{
				M-=a[i][1];
				//System.out.println("aa"+M);
				answer+=a[i][0]*(a[i][1]+M);
			}
			//System.out.println(answer);
			if(M<=0)
			{
				break;
			}
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		System.out.println(answer);
	}
}