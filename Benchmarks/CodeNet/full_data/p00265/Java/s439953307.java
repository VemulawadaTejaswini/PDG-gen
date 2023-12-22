import java.util.Scanner;
import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
Scanner scan=new Scanner(System.in);
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));


int n,q;
n=scan.nextInt();
q=scan.nextInt();
int c[]=new int[n];
String str=input.readLine();

String str_ary[]=str.split(" ");

int max=0;
for(int i=0;i<n;i++)
{
c[i]=Integer.parseInt(str_ary[i]);

}
for(int i=0;i<n;i++)
{


int x=scan.nextInt();

	for(int j=0;j<q;j++)
	{
	
	if(max<c[j]%x)max=c[j]%x;
	}
	System.out.println(max);
}
}
}