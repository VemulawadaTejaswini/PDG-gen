import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		
		sc.close();
		
		if(Character.isUpperCase(a.charAt(0)))
		{
		    System.out.println("A");
		}
		else {
		    System.out.println("a");
		}
		
	}

}