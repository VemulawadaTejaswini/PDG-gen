import java.io.*;
class Main
{
public static void main(String args[])throws IOException
{
BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
String str=input.readLine();
if(str.equals("END OF INPUT"))break;
String str_ary[]=str.split(" ");
for(int i=0;i<str_ary.length;i++)
{
System.out.print(str_ary[i].length());
}
System.out.println();
}
}
}