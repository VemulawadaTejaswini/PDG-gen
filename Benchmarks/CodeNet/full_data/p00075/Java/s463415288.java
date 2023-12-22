import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str;
	while((str=input.readLine())!=null)
	    {
		String str_ary[]=str.split(",");
		int n=Integer.parseInt(str_ary[0]);
		
		Double a[]=new Double[2];
		for(int i=0;i<2;i++)
		    {
			a[i]=Double.parseDouble(str_ary[i+1]);
		    }
		
		if(a[0]/Math.pow(a[1],2)>=25)System.out.println(n);
	    }
    }
}