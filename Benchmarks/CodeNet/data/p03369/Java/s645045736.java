import java.io.*;
class Sample1
{
public static void main(String[] args) throws IOException
{
BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
char c = Integer.parseInt(str);
if(c == "ooo");{
System.out.println("1000");
}
if(c == "oox");{
System.out.println("900");
}
if(c == "oxo");{
System.out.println("900");
}
if(c == "oxx");{
System.out.println("800");
}
if(c == "xoo");{
System.out.println("900");
}
if(c == "xox");{
System.out.println("800");
}
if(c == "xxo");{
System.out.println("800");
}
if(c == "xxx");{
System.out.println("700");
}
}
}