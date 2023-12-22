import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	int x=1;

	for(int i=n;i>0;i--)
	    {
		
		x*=i;
	    }
	if(n==0)x=0;
	System.out.println(x);
    }
}