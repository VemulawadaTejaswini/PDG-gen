import java.math.*;
import java.io.*;


class Main
{
    
    public static void main(String args[])throws IOException
    {
	BigInteger a = new BigInteger("1");
	for(int i=2;i<=1501;i++)
	    a = a.multiply(new BigInteger(Integer.toString(i)));
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));   
	a = a.add(new BigInteger("111"));
	int n = Integer.parseInt(in.readLine());
	System.out.println(a);
	for(int i=111;i<n+111;i++)
	    System.out.println(i);

    }

}