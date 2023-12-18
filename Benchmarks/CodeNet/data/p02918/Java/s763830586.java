
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0,n,k,temp1,temp2,rev = 0;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		n = Integer.parseInt(s[0]);
		k = Integer.parseInt(s[1]);
		str = bf.readLine();
		temp1 = str.charAt(0);
		for(int i = 1;i < n;++i) {
			temp2 = str.charAt(i);
			if(temp1 != temp2) {
				rev++;
			}
			temp1 = temp2;
		}
		rev -= k*2;
		if(rev < 0) {
			rev = 0;
		}
		ans = n - rev - 1;
		System.out.println(ans);
	}
}