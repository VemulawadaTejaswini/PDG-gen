import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
	int x;
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	x=Integer.parseInt(input.readLine());
	System.out.println((int)(Math.pow(x,3)));
    }
}