import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	char a[]=input.readLine().toCharArray();
	for(int i=0;i<a.length;i++)
	    {
		char x=a[i];
		if(a[i]=='A')x='X';
		else if(a[i]=='B')x='Y';
		else if(a[i]=='C')x='Z';
		    x=(char)(a[i]-3);
		System.out.print(x);
	    }
	System.out.println();
    }
}