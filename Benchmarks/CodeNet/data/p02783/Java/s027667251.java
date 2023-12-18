import java.util.*;
public class MyClass {
	public static void main(String[] args) {
		try{
			Scanner sc=new Scanner(System.in);
			int h,a,c=0;
			System.out.println("Enter H:- ");
			h=sc.nextInt();
			System.out.println("Enter a:- ");
			a=sc.nextInt();
			if((h<=0 || h>=10001) || (a<=0 || a>=10001))
			{
			 	System.out.println("EXit.....");
				System.exit(0);
			}
			else
			{
				for(;;)
				{
					if(h<=0)
					{
						System.out.println(c);
						break;
					}
					else{
						h=h-a;
						c++;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error");
			System.exit(0);
		}
	}
}