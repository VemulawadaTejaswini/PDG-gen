
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int a,b,c,ans = 0,temp;
		String str = bf.readLine();
		String[] arrs = str.split(" ");
		a = Integer.parseInt(arrs[0]);
		b = Integer.parseInt(arrs[1]);
		c = Integer.parseInt(arrs[2]);

		if(b >= a*c) {
			ans = c;
		} else {
			ans = b/a;
		}

		System.out.println(ans);
	}
}