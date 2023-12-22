import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	
	while((str=input.readLine())!=null)
	    {
		for(int i=0;i<str.length();)
		    {
			
			if(str.charAt(i)=='@')
			    {
				int n=Integer.parseInt(str.charAt(i+1)+"");
				
				i+=2;
				for(int j=0;j<n-1;j++)
				    {
					
					System.out.print(str.charAt(i));
					
				    }
			    }
			else 
			    {
				System.out.print(str.charAt(i));
				i++;
			    }
		    }
		System.out.println();
	    }
	
    }
}