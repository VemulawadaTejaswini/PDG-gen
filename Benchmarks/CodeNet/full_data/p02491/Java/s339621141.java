import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		String[]	s	= new String[2];
		int			a,b,d,r;
		double		f;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);

		d = a/b;
		r = a%b;
		f = (float)a/b;

		System.out.println(d + " " + r + " " + f);
	}
}