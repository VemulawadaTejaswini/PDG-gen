import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double r = Double.parseDouble(str);
		double l = Math.PI * r * 2;
		double S = Math.PI * r * r;
		System.out.printf("%.6f %.6f", l, S); 
	}
}