/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		int p =0;
		int n = s1.length();
		int i;
		for(i=0; i<n; i++)
		{
		    char x = s1.charAt(i);
		    
		    if((i+1)%2 != 0)
		    {
		        
		        if(x == 'R')
		            p = 0;
		        else if(x == 'U')
		            p = 0;
		        else if(x == 'D')
		            p = 0;
		        else
		        {
		            
		            p = 1;
		            break;
		        }
		    }
		    else
		    {
		        
		        if(x == 'L')
		            p = 0;
		        else if(x == 'U')
		            p = 0;
		        else if(x == 'D')
		            p = 0;
		        else
		        {
		            p = 1;
		            break;
		        }
		    }
		}
		if(p == 0)
		    System.out.println("Yes");
		else
		    System.out.println("No");
	}
}
