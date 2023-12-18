import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int n;
		long k,temp = 0,b = 0,ans,ans1,ans2;
		int[] a;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		n = Integer.parseInt(s[0]);
		k = Long.parseLong(s[1]);
		str = bf.readLine();
		s = str.split(" ");
		a = new int[n];
		for(int i = 0;i < n;++i) {
			a[i] = Integer.parseInt(s[i]);
			for(int j = 0;j < i;++j) {
				if(a[j] > a[i]) {
					b++;
				} else if(a[j] < a[i]) {
					temp++;
				}
			}
		}
		ans1 = temp;
		long num = k*(k-1)/2;
		num %= 1e9+7;
		ans1 *= num;
		ans1 %= 1e9+7;
		ans2 = b;
		num = k*(k+1)/2;
		num %= 1e9+7;
		ans2 *= num;
		ans2 %= 1e9+7;
		ans = ans1+ans2;
		ans %= 1e9+7;
		System.out.println(ans);
	}
}
