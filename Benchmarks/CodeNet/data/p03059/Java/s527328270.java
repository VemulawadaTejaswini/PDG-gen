import java.util.*;

class Main
{
	public static void main(String[] args)
	{
		int A,B,T,Ans=0,M=0;
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		T = sc.nextInt();
		T+=0.5;
		M=0;
		for(int i=1;i*A<T;i++)
		{
			M+=A;
			Ans+=B;
		}
		System.out.println(Ans);
	}
}