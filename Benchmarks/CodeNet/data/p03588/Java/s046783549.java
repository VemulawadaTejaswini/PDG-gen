import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
//		int A[]=new int[N];
//		int B[]=new int[N];
		
		
		int max_num=sc.nextInt();;
		int min_val=sc.nextInt();;
		
		int num=0;
		int val=0;
		for(int i=1;i<N;i++)
		{
			num=sc.nextInt();
			val=sc.nextInt();
			if(max_num<num)
			{
				max_num=num;
				min_val=val;
			}
		}
		System.out.println(max_num+min_val);
		sc.close();
		
	}

}
