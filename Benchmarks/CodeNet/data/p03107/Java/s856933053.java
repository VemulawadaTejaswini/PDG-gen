
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n0 = 0,n1 = 0,ans = 0;
		String str = bf.readLine();
		for(int i = 0;i<str.length();++i) {
			if(str.charAt(i) == '0') {
				n0++;
			} else {
				n1++;
			}
		}
		if(n0 > n1) {
			ans = n1*2;
		} else {
			ans = n0*2;
		}
		System.out.println(ans);
	}
}