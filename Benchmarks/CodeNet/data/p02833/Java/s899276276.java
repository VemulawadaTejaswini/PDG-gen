import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		long n = Long.parseLong(br.readLine()), ans = 0;
		for (long cur = 10; cur <= n; cur *= 5) {
			ans += n / cur;
		}
		System.out.println(ans);
	}
}
