import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] s = r.readLine().split(" ");
		int[] a = {Integer.valueOf(s[0]), Integer.valueOf(s[1]), Integer.valueOf(s[2]), Integer.valueOf(s[3]), Integer.valueOf(s[4])};
		Arrays.sort(a);
		for(int i = 4; i > 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println(a[0]);
	}
}