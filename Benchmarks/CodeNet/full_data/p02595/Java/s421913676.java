import java.io.*;
import java.util.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] lo = reader.readLine().split(" ");
		int n = Integer.parseInt(lo[0]);
		double d = Double.parseDouble(lo[1]);
		int ans = 0;
		for(int i = 0;i<n;i++){
			String[] po = reader.readLine().split(" ");
			long x = Long.parseLong(po[0]);
			long y = Long.parseLong(po[1]);
			if(Math.sqrt(x*x+y*y) <=d) ans++;
		}
		System.out.println(ans);
	}
}