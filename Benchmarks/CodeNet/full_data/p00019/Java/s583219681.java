import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main
{

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(in.readLine());
		System.out.println(factorial(p));

	}
	public static Long factorial(int p)
	{
		Long result;
		if (p==0) result = (long) 1;
		else if (p==1) result = (long) 1;
		else result = p*factorial(p-1);
		
		return result;
	}

}