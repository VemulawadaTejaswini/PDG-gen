import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args){
		String[]	s	= new String[2];
		int a=0,b=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			s = br.readLine().split(" ");
			a = Integer.parseInt(s[0]);
			b = Integer.parseInt(s[1]);
		} catch (NumberFormatException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.print((int)a/b + " " + a%b + " " + (float)a/b);
	}
}