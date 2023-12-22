import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int D = sc.nextInt();
	
	int X,Y,D1,F=0;
	for (int i =0 ;i<N;i++)
	{
		X=sc.nextInt();
		Y=sc.nextInt();
		D1=X*X +Y*Y;
		if(D1<=(D*D))
		{
		F++;	
		}
	}
	System.out.println(F);
	}
}
