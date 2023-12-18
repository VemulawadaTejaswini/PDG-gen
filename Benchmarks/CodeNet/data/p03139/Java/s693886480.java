import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		//String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		int N=0;
		int A=0;
		int B=0;
		int L=0;
		int S=0;
		int max=0;
		int min=0;
		int a=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		A=sc.nextInt();
		B=sc.nextInt();
		//for(int i=0;i<N;i++)
		//{
		//	t[i]=sc.nextInt();
		//	d[i]=sc.nextInt();
		//}
		//String S=sc.next();
		
		//処理
		if(A==B)
		{
			max=A;
			min=B;
			System.out.println(max+" "+min);
			System.exit(0);
		}
		else if(N<A || N<B)
		{
			max=0;
			min=0;
			System.out.println(max+" "+min);
			System.exit(0);
		}
		else
		{
			L=Math.max(A,B);
			S=Math.min(A,B);
		 	max=S;
		 	a=L+S;
		 	if(a<=N)
		 	{
		 		min=0;
		 	}
		 	else if(a>N)
		 	{
		 		min=a-N;
			}
		 }
		// 出力
		//System.out.println(Arrays.deepToString(td));
		//System.out.println(answer);
		System.out.println(max+" "+min);
	}
}