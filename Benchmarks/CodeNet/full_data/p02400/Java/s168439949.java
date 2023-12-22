import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double r= Double.parseDouble(reader.readLine());
		System.out.printf("%6f %6f",r*r*Math.PI,r*2*Math.PI);		
		
		
	}
}