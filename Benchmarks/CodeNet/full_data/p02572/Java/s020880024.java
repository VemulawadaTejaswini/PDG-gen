import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		int n=input.nextInt();
		long[] arr=new long[n];
		long mod=1000000007;
		long sum=0;
		for(int i=0;i< arr.length;i++)
		{
			arr[i]=input.nextLong();
		}
		for(int i=0;i< arr.length;i++)
		{
			for(int j=0;j< arr.length-1;j++)
			{
				if(i<j)
				{
					long ans=arr[i]*arr[j];
					sum=sum+ans;
				}
					
				
				
			}
		}
		System.out.println((sum%mod));

	}

}
