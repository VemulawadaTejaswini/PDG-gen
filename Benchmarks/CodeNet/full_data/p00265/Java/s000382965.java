import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
String str=input.readLine();
String str_ary[]=str.split(" ");
int n,q;
n=Integer.parseInt(str_ary[0]);

q=Integer.parseInt(str_ary[1]);
int c[]=new int[n];
str=input.readLine();
String str_ary2[]=str.split(" ");
for(int i=0;i<n;i++)
{
c[i]=Integer.parseInt(str_ary2[i]);
}
for(int i=0;i<q;i++)
{
int max=0;
int x=Integer.parseInt(input.readLine());
	for(int j=0;j<n;j++)
	{
	if(max<c[j]%x)
	{
	max=c[j]%x;
	if(max==x-1)break;
	}
	}
	System.out.println(max);
}
}
}