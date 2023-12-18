
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,k;
		String ans = "";
		String str;
		String[] s;
		str = bf.readLine();
		n = Integer.parseInt(str);
		str = bf.readLine();
		ans = str;
		str = bf.readLine();
		k = Integer.parseInt(str);
		String p = "[^" + ans.charAt(k-1) + "]";
		ans = ans.replaceAll(p, "*");
		System.out.println(ans);
	}
}