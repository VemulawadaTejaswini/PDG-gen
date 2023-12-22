import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		String s=input.next();
		if(s.charAt(0)=='R' && s.charAt(1)=='R' && s.charAt(2)=='R')
		{
			System.out.println(3);
		}	
		else if(s.charAt(0)=='R' && s.charAt(1)=='R')
		{
			System.out.println(2);
		}
		else if(s.charAt(1)=='R' && s.charAt(2)=='R')
		{
			System.out.println(2);
		}
		else if(s.charAt(1)=='S')
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
		       
		
		           
		

	}

}