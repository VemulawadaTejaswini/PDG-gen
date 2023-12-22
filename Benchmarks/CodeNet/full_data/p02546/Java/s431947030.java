import java.util.*;
import java.lang.*;
import java.io.*;
 class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   // Scanner sc=new Scanner(System.in);
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=1;
	  //  t=sc.nextInt();
	    //int t=Integer.parseInt(br.readLine());
	    while(--t>=0){
	       String s=br.readLine();
	       if(s.charAt(s.length()-1)=='s')
	       System.out.println(s+"es");
	       else
	        System.out.println(s+"s");
	     
	        
	    }
	    
	}
}