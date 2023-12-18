import java.io.*;
class Sample1
{
public static void main(String[] args) throws IOException
{
BufferedReader br =
    new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
char c = Integer.parseInt(str);
if(c == "ooo"){
System.out.println("1000");
}
else(c == "oox"){
System.out.println("900");
}
else(c == "oxo"){
System.out.println("900");
}
else(c == "oxx"){
System.out.println("800");
}
else(c == "xoo"){
System.out.println("900");
}
else(c == "xox"){
System.out.println("800");
}
else(c == "xxo"){
System.out.println("800");
}
else(c == "xxx"){
System.out.println("700");
}
}
}