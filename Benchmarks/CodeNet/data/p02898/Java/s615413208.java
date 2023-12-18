
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n,k,ans = 0;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		str = bf.readLine();
		s = str.split(" ");
		for(int i = 0;i < n;++i) {
			if(k <= Integer.parseInt(s[i])) {
				ans++;
			}
		}

		System.out.println(ans);
	}
}