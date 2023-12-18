
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int n=input.nextInt();
		int[] arr=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();			
		}		
		int c=count(arr);
		if(c==n)
		{
			System.out.print("YES");
		}
		else
		{
			temp=arr[0];
			arr[0]=arr[n-1];
			arr[n-1]=temp;
			int t=count(arr);
			if(t==n)
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
		input.close();


	}
	public static int count(int[] arr) 
	{
		int c=0;
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]<arr[j+1]) 
			{
				c++;
			}
		}
		return (c+1);
	}

}
