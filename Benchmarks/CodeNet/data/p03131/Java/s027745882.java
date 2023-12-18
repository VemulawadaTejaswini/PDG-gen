import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		//int answer=0;
		long answer=0;
		//double answer=0;
		//String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		long K=0;
		long A=0;
		long B=0;
		int max=0;
		int min=0;
		int sum=0;
		long e=0;
		long f=0;
		long g=0;
		long h=0;
		//int sub=0;
		//int a=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		K=sc.nextInt();
		A=sc.nextInt();
		B=sc.nextInt();
		//X=sc.nextDouble();
		//for(int i=0;i<3;i++)
		//{
		//	a[i]=sc.nextInt();
		//}
		//String S=sc.next();
		
		//処理
		if(B-A<2)
		{
			answer=K+1;
			//System.out.println("c1");
		}else if(A>=K)
		{
			answer=K+1;
			//System.out.println("c2");
		}else
		{
			e=A-1;
			f=(K-e)/2;
			g=(K-e)%2;
			h=B-A;
			answer=1+e+(f*h)+g;
		}
		
		// 出力
		//System.out.println(Arrays.toString(X))
		//System.out.println(Arrays.deepToString(td));
		System.out.println(answer);
	}
}