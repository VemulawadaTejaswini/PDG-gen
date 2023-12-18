import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(in.readLine());
		s = s.replaceAll(" ", "");
		int i = Integer.parseInt(s);
		String opt;
		if(i%4 == 0) opt = "YES";
		else opt = "NO";
		System.out.println(opt);
	}

}
