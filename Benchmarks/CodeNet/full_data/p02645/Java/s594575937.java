import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		String str=s.next();
		
		for(int i=0;i<3;i++)
		{
			System.out.print(str.charAt(i));
		}
		
	}
	
}