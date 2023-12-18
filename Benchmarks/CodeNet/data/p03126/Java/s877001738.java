import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] p = br.readLine().split("[\\s]+");
		int n = Integer.parseInt(p[0]);
		int m = Integer.parseInt(p[1]);
		int[] c = new int[m];
		for (int i=0;i<n;i++) {
	    	int[] a = Arrays.stream(br.readLine().split("[\\s]+"))
				.mapToInt(Integer::parseInt).toArray();
	    	for (int j=1;j<a.length;j++) c[a[j]-1]++;
		}
		int ans = 0;
		for (int i=0;i<m;i++) if (c[i] == n) ans++;
		System.out.println(ans);
    }

}