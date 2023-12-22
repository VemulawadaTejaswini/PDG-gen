import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	String str=input.readLine();
	
	
		str=str.replaceAll("apple","tmp1");
		str=str.replaceAll("peach","tmp2");
		str=str.replaceAll("tmp1","peach");
		str=str.replaceAll("tmp2","apple");
	    
	    System.out.println(str);
	
    }
}