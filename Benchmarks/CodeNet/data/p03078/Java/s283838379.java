
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int[][] memo;

	public static int hoge(int current, int n, String last) {
		return 0;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int x,y,z,k,i1,i2,i3;
		long temp;
		long[] a,b,c,ans;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split("");
		x = Integer.parseInt(s[0]);
		a = new long[x];
		y = Integer.parseInt(s[1]);
		b = new long[y];
		z = Integer.parseInt(s[2]);
		c = new long[z];
		k = Integer.parseInt(s[3]);
		ans = new long[k];
		str = bf.readLine();
		s = str.split("");
		for(i1 = 0;i1 < x;++i1) {
			a[i1] = Long.parseLong(s[i1]);
		}
		str = bf.readLine();
		s = str.split("");
		for(i1 = 0;i1 < y;++i1) {
			b[i1] = Long.parseLong(s[i1]);
		}
		str = bf.readLine();
		s = str.split("");
		for(i1 = 0;i1 < z;++i1) {
			c[i1] = Long.parseLong(s[i1]);
		}
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		for(i1 = x-1;i1 >= 0;--i1) {
			if(a[i1] + b[y-1] + c[z-1] <= ans[0]) {
				break;
			}
			for(i2 = y-1;i2 >= 0;--i2) {
				if(a[i1] + b[i2] + c[z-1] <= ans[0]) {
					break;
				}
				for(i3 = z-1;i3 >= 0;--i3) {
					temp = a[i1] + b[i2] + c[i3];
					if(temp <= ans[0]) {
						break;
					} else {
						ans[0] = temp;
						Arrays.sort(ans);
					}
				}
			}
		}
		for(i1 = k-1;i1 >= 0;--i1) {
			System.out.println(ans[i1]);
		}
	}
}