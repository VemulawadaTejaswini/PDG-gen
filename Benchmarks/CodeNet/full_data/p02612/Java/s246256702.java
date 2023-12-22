import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int rem=n%1000;
		
		int ans=1000-rem;
		
		if(ans==1000)
			ans=0;
		
		System.out.println(ans);
		
	}	
	
}