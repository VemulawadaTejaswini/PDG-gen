import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(r.readLine());
		for(int i = 0; i < n; i++) {
			String s = r.readLine();
			int a = s.indexOf(" ");
			int z = s.lastIndexOf(" ");
			int[] arr = new int[3];
			arr[0] = Integer.valueOf(s.substring(0, a));
			arr[1] = Integer.valueOf(s.substring(a+1, z));
			arr[2] = Integer.valueOf(s.substring(z+1));
			Arrays.sort(arr);
			if((arr[2] * arr[2]) == arr[0] * arr[0] + arr[1] * arr[1]) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}