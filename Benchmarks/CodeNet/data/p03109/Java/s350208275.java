import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		//int answer=0;
		//long answer=0;
		//double answer=0;
		String answer="Heisei";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		//int sub=0;
		int y=0;
		int m=0;
		int d=0;
		String s="";
		int max=0;
		int min=Integer.MAX_VALUE;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		//N=sc.nextInt();
		//X=sc.nextDouble();
		//int A[]=new int[N];
		//List<Integer> A=new ArrayList<Integer>();
		//for(int i=0;i<N;i++)
		//{
		//	A.add(sc.nextInt());
		//}
		String S=sc.next();
		
		//処理
		s=S.substring(0,4);
		y=Integer.parseInt(s);
		//System.out.println(y);
		if(y>2019)
		{
			answer="TBD";
			System.out.println(answer);
			System.exit(0);
		}
		s=S.substring(5,7);
		m=Integer.parseInt(s);
		//System.out.println(m);
		if(m>4)
		{
			answer="TBD";
			System.out.println(answer);
			System.exit(0);
		}
		s=S.substring(8,10);
		d=Integer.parseInt(s);
		//System.out.println(d);
		if(d>30)
		{
			answer="TBD";
			System.out.println(answer);
			System.exit(0);
		}
			
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		//System.out.println(1000000000%13);
		System.out.println(answer);
	}
}