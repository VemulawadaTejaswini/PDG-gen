import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		//変数
		int count=0;
		boolean sw=false;
		boolean sw2=false;
		boolean sw3=false;
		int answer=0;
		//String answer="Heisei";
		//List<Integer> h=new ArrayList<Integer>();
		//int t[]=new int[(int)Math.pow(10,5)];
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int x=1;
		int y=2;
		//入力
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int K=sc.nextInt();
		//X=sc.nextDouble();
		//int A[]=new int[N];
		//List<Integer> l=new ArrayList<Integer>();
		//List<Integer> w=new ArrayList<Integer>();
		//for(int i=0;i<N;i++)
		//{
		//	l.add(sc.nextInt());
		//}
		//String S=sc.next();
		
		//処理
		while(sw==false)
		{
			//System.out.println("count"+x);
			if(A%x==0 && B%x==0)
			{
				count++;
				if(count==K)
				{
					answer=x;
					sw=true;
				}
				System.out.println(x);
			}else
			{
				sw3=false;
				int n=x;
				y=2;
				List<Integer> l=new ArrayList<Integer>();
				while(n!=1)
				{
					if(n%y==0)
					{
						n=n/y;
						l.add(y);
					}else
					{
						y++;
					}
				}
				//System.out.println(Arrays.toString(l.toArray()));
				for(int j=0;j<l.size();j++)
				{
					if(l.get(j)!=2 || l.get(j)!=5)
					{
						sw3=true;
					}
				}
				
				if(sw3==false)
				{
					count++;
					if(count==K)
					{
						answer=x;
						sw=true;
					}
				}
			}
			x++;
		}
		// 出力
		//System.out.println(Arrays.toString(X));
		//System.out.println(Arrays.deepToString(a));
		//System.out.println(Arrays.toString(A.toArray()));
		System.out.println(answer);
	}
}