import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		//int answer=0;
		//long answer=0;
		double answer=0;
		//String answer="Heisei";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		//int sub=0;
		int max=0;
		int min=Integer.MAX_VALUE;
		//int t[]=new int[(int)Math.pow(10,5)];
		String s="";
		double a=0;
		
		//入力
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		//X=sc.nextDouble();
		//int A[]=new int[N];
		List<Double> x=new ArrayList<Double>();
		List<String> u=new ArrayList<String>();
		for(int i=0;i<N;i++)
		{
			x.add(sc.nextDouble());
			u.add(sc.next());
		}
		//String S=sc.next();
		//for(int i=0;i<N;i++)
		//{
		//	a=x.get(i);
		//	System.out.println(a);
		//}
		
		//処理
		for(int i=0;i<N;i++)
		{
			s=u.get(i);
			//System.out.println(s);
			if(s.equals("JPY"))
			{
				a=x.get(i);
				//System.out.println("JPY");
				answer+=a;
			}else
			{
				a=x.get(i);
				a=a*380000.0;
				//System.out.println("BTC");
				answer+=a;
			}
		}
			
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		System.out.println(answer);
	}
}