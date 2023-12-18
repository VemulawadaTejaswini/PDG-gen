/* بِسْمِ اللَّهِ الرَّحْمَٰنِ الرَّحِيمِ */
//codeforces_279B
//o(n * log(n))
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Math.*;
import java.math.*;

public class Main{

	static PrintWriter go = new PrintWriter(System.out);
	
	public static void main(String args[]) throws IOException,FileNotFoundException {
		BufferedReader gi = new BufferedReader(new InputStreamReader(System.in, "ISO-8859-1"));
		int[] l = parseArray(gi);
		int n = l[0];
		int m = l[1];
		int[][] jobs = new int[n][];
		for ( int k = 0; k < n; k++ ){
			jobs[k] = parseArray(gi);
		}
		Arrays.sort(jobs, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (a[1] == b[1]) return b[0] - a[0];
				return b[1] - a[1];
			}
		});
		int ans = 0;
		for ( int k = 0; k < n; k++ ){
			if (jobs[k][0] <= m) { ans += jobs[k][1]; m -= 1; }
		}
		go.println(ans);
		go.close();
	}

	static int[] parseArray(BufferedReader gi) throws IOException{
		String[] line = gi.readLine().split(" ");
		int[] rez = new int[line.length];
		for ( int k = 0; k < line.length; k++){
			rez[k] =  Integer.parseInt(line[k]);
		}
		return rez;
	}

}

