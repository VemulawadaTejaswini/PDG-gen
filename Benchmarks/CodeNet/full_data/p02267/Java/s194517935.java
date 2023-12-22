import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(input.readLine());
	int a[]=new int[n];
	String str1=input.readLine();
	String str_ary1[]=str1.split(" ");
	for(int i=0;i<n;i++)
	    {
		a[i]=Integer.parseInt(str_ary1[i]);
	    }
	int m=Integer.parseInt(input.readLine());
	int b[]=new int[m];
	String str2=input.readLine();
	String str_ary2[]=str2.split(" ");
	for(int i=0;i<m;i++)
	    {
		b[i]=Integer.parseInt(str_ary2[i]);
	    }
	int x=0;
	for(int i=0;i<n;i++)
	    {
		for(int j=0;j<m;j++)
		    {
			if(a[i]==b[j])x++;
		    }
	    }
	System.out.println(x);
    }
}