import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	int m=0,n=str.length()-1;
	char ch[]=str.toCharArray();
	for(int i=n;i>=0;i--)
	    {
		System.out.print(ch[i]);
	    }
	System.out.println();
	    
    }
}