import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	for(int i=0;i<n;i++)
	    {
		int out=0,hit=0,count=0;
		while(out!=3)
		    {
			String str=input.readLine();
			if(str.equals("HIT"))hit++;
			else if(str.equals("OUT"))out++;
			else if(str.equals("HOMERUN"))
			    {
				count+=hit+1;
				hit=0;
			    }
			if(hit==4)
			    {
				count++;
				hit--;
			    }
		    }
		System.out.println(count);
	    }
    }
}