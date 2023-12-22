import java.io.*;

class AOJ10002
{
    public static void main(String[] args) throws IOException
    {
	BufferedReader br =
	    new BufferedReader(new InputStreamReader(System.in));

	String str = br.readLine();
	
	int num = Integer.parseInt(str);

	num = num * num * num;

	System.out.println(num);
    }
}