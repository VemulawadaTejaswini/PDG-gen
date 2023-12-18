import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        String s=scanner.nextLine();
	        int m=0;
	        int k=0;
	        boolean flag=false;
	        for(int i=0;i<s.length();i++)
	        {
	        	if(flag==false &&s.charAt(i)=='C')
	        	{
	        		flag=true;
	        		m=i;
	        	}
	        	if(i>m&&s.charAt(i)=='F'&&flag==true)
	        	{
	        		System.out.println("Yes");
	        		break;
	        	}
	        }
	        
	        System.out.println("No");
	      
	    }

	 
}


