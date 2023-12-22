import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
		
		String strS = br.readLine();
		String strP = br.readLine();
		
		StringBuffer sb = new StringBuffer(strS);
		
		sb.append(strS);
		
		System.out.println( (sb.indexOf(strP) == -1 ? "No" : "Yes") );
	}
}