import java.io.*;
class Main
{
public static void main(String[] args) throws IOException
{
BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
String str1 = br.readLine();
String str2 = br.readLine();
int len = Integer.parseInt(str1);
int wid = Integer.parseInt(str2);


System.out.println(len*wid);
System.out.println(2*(len+wid));
}
}