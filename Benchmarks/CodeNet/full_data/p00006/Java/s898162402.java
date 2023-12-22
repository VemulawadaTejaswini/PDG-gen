import java.io.*;
public class Converstion
{
public static void main(String [] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("Enter the string");
String s = br.readLine();
int i,l;
char ch;
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(Character.isUpperCase(ch))
System.out.print(Character.toLowerCase(ch));
else if(Character.isLowerCase(ch))
System.out.print(Character.toUpperCase(ch));
else
System.out.print(ch);
}
}
}