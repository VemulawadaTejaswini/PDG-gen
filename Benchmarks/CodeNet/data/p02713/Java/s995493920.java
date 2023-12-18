import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int k=s.nextInt();
		
		long ans=0;
		
		for(int i=1;i<=k;i++)
		{
			for(int j=1;j<=k;j++)
			{
				for(int l=1;l<=k;l++)
				{
					ans=ans+gcd(i,gcd(j,l));
				}
			}
		}
		
		System.out.println(ans);
		
	}
	
	public static int gcd(int a, int b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
	
}