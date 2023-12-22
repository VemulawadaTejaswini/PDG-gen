import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	    {
		int i=0;
		int n=Integer.parseInt(input.readLine());
		for(int a=0;a<10;a++)
		    {
			for(int b=0;b<10;b++)
			    {
				for(int c=0;c<10;c++)
				    {
					for(int d=0;d<10;d++)
					    {
						if(n==(a+b+c+d))i++;
					    }
				    }
			    }
		    }
		System.out.println(i);
	    }
    }
}