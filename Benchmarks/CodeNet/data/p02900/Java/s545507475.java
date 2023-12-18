
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		double a,b,ans = 0,temp,kouyaku,n;
		String str;
		String[] s;
		str = bf.readLine();
		s = str.split(" ");
		a = Double.parseDouble(s[0]);
		b = Double.parseDouble(s[1]);
		if(a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while(a%b != 0) {
			temp = a%b;
			a = b;
			b = temp;
		}
		kouyaku = b;
		ans = 1;
		if(kouyaku != 1) {
			if(kouyaku%2 == 0) {
				ans++;
				while(kouyaku%2 == 0) {
					kouyaku /= 2;
				}
			}
			n = 3;
			if(kouyaku != 1) {
				while(kouyaku > n*n) {
					if(kouyaku%n == 0) {
						ans++;
						while(kouyaku%n == 0) {
							kouyaku /= n;
						}
					}
					n += 2;
				}
				ans++;
			}
		}
		System.out.println(ans);
	}
}