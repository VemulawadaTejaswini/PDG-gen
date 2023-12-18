import java.io.*;
import java.util.*;

public class dpA {

	static int MAXW = 100000+1;
	static int MAXN = 101;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int mw = Integer.parseInt(st.nextToken());
		
		long[] maxv = new long[mw+1];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			for(int j = mw-w; j >=0; j--) {
				maxv[j+w] = Math.max(maxv[j] + v, maxv[j+w]);
			}
		}
		
		bw.write(""+maxv[mw]);
		bw.close();
	}

}
