
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String res= "";
		
		for(int i=0;i<a.length()+b.length();i++)
		{
			if(i%2==0)
			{
				res+=a.charAt(i/2);
			}
			
			else
			{
				res+=b.charAt((i-1)/2);
			}
		}
		
		System.out.println(res);
		 
			
		
	
		
		sc.close();

	}

}
