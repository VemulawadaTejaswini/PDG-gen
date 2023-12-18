import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int m=s.nextInt();
		
		int[] arr=new int[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			sum=sum+arr[i];
		}
		
		int min=sum/(4*m);
		
		int count=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]>min)
			{
				count++;
			}
		}
		
		if(count>=m)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
	
}