import java.io.*;
import java.util.StringTokenizer;
class Main {

	public static void main(String args[])throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		String s=BR.readLine();
		
		StringTokenizer st=new StringTokenizer(s);
		long a=Long.parseLong(st.nextToken());
		long b=Long.parseLong(st.nextToken());
		long c=Long.parseLong(st.nextToken());
		long k=Long.parseLong(st.nextToken());
		/*for(int i=0;i<k;i++)
		{
			long temp1=b+c;
			long temp2=a+c;
			long temp3=a+b;
			a=temp1;
			b=temp2;
			c=temp3;
			System.out.println(a+" "+b+" "+c+" "+(a-b));
		}*/
		long q=a-b;
		//long g=(long) Math.pow(10,18);
		//System.out.println(g);
		if(q>Math.pow(10, 18))
		{
			System.out.println("Unfair");
		}
		else
			{
			if(k%2==0 && a<c)
				System.out.println(-(q));
			else
				System.out.println((q));
			}
	}
}
