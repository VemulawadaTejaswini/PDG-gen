
import java.util.*;
public class Main{
	
	void cal()
	{
		Scanner sc=new Scanner(System.in);
		int H,A;
		H=sc.nextInt();
		A=sc.nextInt();
		int i=0;
		for(i=0;i<H;i++)
		{
			H=H-A;
			
			if(H<0)
			{
				break;
			}
			
		}
		System.out.println(i+1);
		
		
	}
	
	
	
	
	




public static void main (String args[])
{
	Main obj= new Main();
	obj.cal();

}
}



