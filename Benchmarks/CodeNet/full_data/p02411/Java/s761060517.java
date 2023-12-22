import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int a, b, c;
		while(true)
		{
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
			if(a == -1  && b == -1 && c == -1)
				break;
			else {
				if(a == -1 || b == -1)
					System.out.println("F");
				else if(a+b < 30)
					System.out.println("F");
				else if(a+b < 50){
					if(c == -1){
						System.out.println("D");
					}
					else {
						if(c >= 50)
							System.out.println("C");
						else
							System.out.println("D");
					}
				}
				else if(a+b < 65)
					System.out.println("C");
				else if(a+b < 80)
					System.out.println("B");
			
				else if(a+b >= 80)
					System.out.println("A");
			}
		}
	}
}