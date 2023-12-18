
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,a,b;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		ans = b/a;
		if(b%a != 0) {
			ans++;
		}
		System.out.println(ans);
	}
}