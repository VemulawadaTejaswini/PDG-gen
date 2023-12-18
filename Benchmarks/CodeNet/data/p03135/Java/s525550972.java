import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		double answer=0;
		//String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		double T=0;
		double X=0;
		int max=0;
		int min=0;
		int a=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		T=sc.nextDouble();
		X=sc.nextDouble();
		//for(int i=0;i<N;i++)
		//{
		//	t[i]=sc.nextInt();
		//	d[i]=sc.nextInt();
		//}
		//String S=sc.next();
		
		//処理
		answer=T/X;
		// 出力
		//System.out.println(Arrays.deepToString(td));
		System.out.println(answer);
		//System.out.println(max+" "+min);
	}
}