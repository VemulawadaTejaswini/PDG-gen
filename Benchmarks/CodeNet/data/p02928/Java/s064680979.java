
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		double k,temp = 0,b = 0,ans = 0;
		int[] a;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		n = Integer.parseInt(s[0]);
		k = Double.parseDouble(s[1]);
		str = bf.readLine();
		s = str.split(" ");
		a = new int[n];
		for(int i = 0;i < n;++i) {
			a[i] = Integer.parseInt(s[i]);
			for(int j = 0;j < i;++j) {
				if(a[j] > a[i]) {
					b++;
					temp++;
				} else if(a[j] < a[i]) {
					temp++;
				}
			}
		}
		double num = (double)temp * (k*(k-1)/2);
		num %= 1e9+7;
		ans += num;
		num = (double)b*k;
		num %= 1e9+7;
		ans += num;
		ans %= 1e9+7;
		System.out.println((int)ans);
	}
}