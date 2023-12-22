
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");

		int n = Integer.parseInt(sl[0]);

		s = r.readLine();
		sl = s.split(" ");
		int a[] = new int[n];
		boolean b[] = new boolean[100001];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sl[i]);
		}

		Arrays.sort(a);

		int pre = -1;
		for (int i = 0; i < n; i++) {
			if(pre == a[i]) continue;
			for(int j = (a[i] << 1); j <= 100000; j += a[i])
			{
				b[j] = true;
			}
		}

		int v = 0;
		for(int i = 0; i < n; i++) {
			if(!b[a[i]]) v++;
		}
		System.out.println(v);
	}
}