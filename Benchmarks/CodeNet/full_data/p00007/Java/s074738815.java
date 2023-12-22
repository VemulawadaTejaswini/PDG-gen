import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int debt = 100000;
		int add_debt =0; //additional debt
		double rate = 0.00005;

		while( n > 0 ){
		    add_debt = (int)Math.ceil(debt * rate);
		    debt += add_debt*1000;
		    n--;
		}
		System.out.println(debt);
	}
}