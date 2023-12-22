import java.io.*;
class Main1{
public static void main(String[] args) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
int a=Integer.parseInt(str);
System.out.println(a*a*a);
}
}