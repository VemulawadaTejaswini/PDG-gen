import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> al = new ArrayList<String>();

		String str;
		// 1???????????\?????????????????????????????????
		while ((str = br.readLine()) != null) {
			if (str.length() == 0) {
				break;
			}
			al.add(str);
		}

		int[][] gcdLcm = new int[al.size()][2];
		int len = al.size();

		for (int i = 0; i < len; i++) {
			String[] buf = al.get(i).split(" ");
			int m = Integer.parseInt(buf[0]);
			int n = Integer.parseInt(buf[1]);
			gcdLcm[i][0] = gcd(m, n);
			gcdLcm[i][1] = lcm((long)m, (long)n, (long)gcdLcm[i][0]);
		}

		//??????
		for(int i=0;i<gcdLcm.length;i++){
			System.out.println(gcdLcm[i][0]+" "+gcdLcm[i][1]);
		}
	}

	// GCD????¨????
	private static int gcd(int m, int n) {
		return n == 0 ? m : gcd(n, m % n);
	}

	// LCM????¨????
	private static int lcm(long m, long n, long gcd) {
		return (int)(m * n / gcd);
	}
}