import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		int answer=0;
		//long answer=0;
		//double answer=0;
		//String answer="NO";
		//List<Integer> h=new ArrayList<Integer>();
		//int af=Integer.MAX_VALUE;
		//int sub=0;
		int N=0;
		int max=0;
		//int t[]=new int[(int)Math.pow(10,5)];
		
		//入力
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		//X=sc.nextDouble();
		//int A[]=new int[N];
		List<Integer> A=new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
			A.add(sc.nextInt());
		}
		//String S=sc.next();
		
		//処理
		Collections.sort(A,Collections.reverseOrder());
		for(int i=1;i<A.size();i++)
		{
			if(A.get(0)%A.get(i)==0)
			{
				count++;
			}else
			{
				int tmp=A.get(i)-	(A.get(0)%A.get(i));
				max=Math.max(max,tmp);
			}
		}
		if(count==N-1)
		{
			answer=A.get(A.size()-1);
		}else
		{
			answer=max;
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		//System.out.println(1000000000%13);
		System.out.println(answer);
	}
}