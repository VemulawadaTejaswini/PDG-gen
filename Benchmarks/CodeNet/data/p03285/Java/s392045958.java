import java.util.Scanner;

public class Main {
	  
	public static void main(String args[]) {
		    Scanner scanner = new Scanner(System.in);
		    
			int N = scanner.nextInt();
			
			if( N % 4 == 0)
			{
				System.out.println("Yes"); 
			}
			else 
			{
				if(  N - 7 % 4 == 0 &&  N >= 7 ) 
				{
					System.out.println("Yes"); 
				} 
				else 
				{
					if( N - 14 % 4 == 0 && N >=14 ) 
					{
						System.out.println("Yes");
					}
					else 
					{
						if( N - 21 % 4 == 0 && N > 21  ) 
						{
							System.out.println("Yes");
						}
						else 
						{
							System.out.println("No");
						}
					}
				}
			}
			
			
		    scanner.close(); }
		  }