import java.io.*;
public class Main{
public static void main(String[] agrs)throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int a=Integer.parseInt(str);
String str1=br.readLine();
int a1=Integer.parseInt(str);
System.out.println(a*a1+" "+a+a+a1+a1);
}
}