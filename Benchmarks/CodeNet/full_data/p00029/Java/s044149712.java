import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	String str_ary[]=str.split(" ");
	
	int a[]=new int[str_ary.length];
	for(int i=0;i<str_ary.length;i++)
	    {
		for(int j=0;j<str_ary.length;j++)
		    {
			if(str_ary[i].equals(str_ary[j]))a[i]++;
		    }
	    }
	int max=0;

	int i;
	
	for(i=0;i<a.length;i++)
	    {
		if(max<a[i])max=i;
	    }
	int x=0;
	int b[]=new int[str_ary.length];
	for(int j=0;j<str_ary.length;j++)
	    {
		b[j]=str_ary[j].length();
	    }
	for(int j=0;j<str_ary.length;j++)
	    {
		if(x<b[j])x=j;
	    }
	System.out.println(str_ary[max]+" "+str_ary[x]);
    }
}