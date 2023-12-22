import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	while(true)
	    {
		int n,sum=0;
		n=Integer.parseInt(input.readLine());
		if(n==0)break;
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		    {
			
			a[i]=Integer.parseInt(input.readLine());
			sum+=a[i];
		    }
		System.out.println(sum);
	    }
    }
}