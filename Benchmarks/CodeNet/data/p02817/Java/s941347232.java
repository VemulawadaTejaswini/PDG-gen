
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
	public static void main(String[] argv) throws IOException {
		BufferedReader f=new BufferedReader(new InputStreamReader(System.in));
		String s1=f.readLine();
		String s2=f.readLine();
		s1=s1+s2;
		System.out.println(s1);
	}
}
