import java.io.*;
import java.util.*;

public class Main {
	static public void main(String[] argv) {
		try{
//			FileWriter fw = new FileWriter("output.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			PrintWriter pw = new PrintWriter(bw, true);
			
//			FileReader fr = new FileReader("input.txt");
//			BufferedReader br = new BufferedReader( fr );
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			PrintWriter pw = new PrintWriter(bw, true);
			
			while(true) {
				String buf = br.readLine();
				StringTokenizer st = new StringTokenizer(buf);
				int n, m;
				n = Integer.valueOf(st.nextToken());
				m = Integer.valueOf(st.nextToken());
				
				if(n == 0 && m == 0) break;
				
				int[] count = new int[m];
				for(int i = 0; i < n; i++) {
					buf = br.readLine();
					st = new StringTokenizer(buf);
					for(int j = 0; j < m; j++) {
						int e = Integer.valueOf(st.nextToken());
						if(e == 1) ++count[j];
					}
				}
				
				ArrayList<Integer> res = solve(count, n, m);
				
				int num = res.size();
				for(int i = 0; i < num; i++) {
					pw.print(res.get(i));
					if(i < num-1) pw.print(" ");
				}
				pw.println();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static ArrayList<Integer> solve(int[] count, int n, int m) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for(int i = n; i >= 0; i--) {
			for(int j = 0; j < m; j++) {
				if(count[j] == i) ret.add(new Integer(j+1));
			}
		}
		return ret;
	}
}