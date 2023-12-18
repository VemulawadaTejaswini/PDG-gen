import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Main
{
	public static void main(String[] args) throws Exception
	{
		invoke(System.in);
//		invoke(new FileInputStream("/tmp/test.txt"));
	}

	public static void	invoke(InputStream is) throws IOException
	{
		// input
		BufferedReader	reader = new BufferedReader(new InputStreamReader(is));
		String	line = reader.readLine();

		String[]	va = line.split(" ");
		int	lsum = Integer.parseInt(va[0]) + Integer.parseInt(va[1]);
		int	rsum = Integer.parseInt(va[2]) + Integer.parseInt(va[3]);

		String	result;
		result =  ((lsum > rsum) ? "Left" : (lsum == rsum) ? "Balanced" : "Right");
		System.out.println(result);

	}

}