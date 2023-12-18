
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] argv) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s1=f.readLine();
		String[] s=new String[2];
		s=s1.split(" ");
		System.out.println(s[0]+'\n'+s[1]);
	}
}
