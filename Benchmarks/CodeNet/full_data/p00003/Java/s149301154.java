import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());

		String[] s;
		for(int i=0; i<n; i++) {
			s = br.readLine().split(" ");
			int a = Integer.valueOf(s[0]);
			int b = Integer.valueOf(s[1]);
			int c = Integer.valueOf(s[2]);
			if( (a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == b*b + a*a) )
				System.out.println("Yes"); 
			else 	System.out.println("No");
		}
	}
}