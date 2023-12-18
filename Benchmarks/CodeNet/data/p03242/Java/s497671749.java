import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.replace('1','x');
		s = s.replace('9','1');
		s = s.replace('x','9');
		System.out.println(s);
	}
}
