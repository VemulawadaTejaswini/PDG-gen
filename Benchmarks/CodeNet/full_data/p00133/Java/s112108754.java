import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
char char_ary[][]=new char[8][8];
for(int i=0;i<8;i++)
{
String str=input.readLine();
char_ary[i]=str.toCharArray();
}
System.out.println("90");
for(int i=7;i>=0;i--)
{
	for(int j=0;j<8;j++)
	{
	System.out.print(char_ary[i][j]);
	}
	System.out.println();
}
//180
System.out.println("180");
for(int i=7;i>=0;i--)
{
	for(int j=7;j>=0;j--)
	{
	System.out.print(char_ary[i][j]);
	}
	System.out.println();
}
//270
System.out.println("270");
for(int i=0;i<8;i++)
{
	for(int j=7;j>=0;j--)
	{
	System.out.print(char_ary[i][j]);
	}
	System.out.println();
}

}
}