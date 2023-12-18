import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(BR.readLine());
		int min=Integer.MAX_VALUE;
		for(int i=1;i<n;i++)
		{
			int a=i;
			int b=n-i;
			
			/*int c=(int) Math.log10(a)+1;
			int d=(int) Math.log10(b)+1;*/
			
			int temp=0;
			
			while(a!=0)
			{
				temp+=a%10;
				a=a/10;
			}
			
			while(b!=0)
			{
				temp+=b%10;
				b=b/10;
			}
			
			if(temp<min)
			{
				min=temp;
			}
		}
		System.out.println(min);
	}
	
}
