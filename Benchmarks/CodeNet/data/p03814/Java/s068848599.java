import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader vf = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(vf.readLine());
		StringBuffer eou = sb.reverse();
		int f = sb.indexOf("A");
		int e = eou.indexOf("Z");
		int o = sb.length() - f - e;
		System.out.println(o);
	}
}
