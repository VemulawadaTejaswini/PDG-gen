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
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//			PrintWriter pw = new PrintWriter(bw, true);
			
			while(true) {
				String buf = br.readLine();
				int n;
				n = Integer.valueOf(buf);
				if(n == 0) break;
				
				solve(n, n, "");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static void solve(int max, int total, String str) {
		for(int i = max; i >= 1; i--) {
			int rest = total - i;
			if(rest < 0) {
				continue;
			} else if(rest == 0) {
				String buf = str + i;
				System.out.println(buf);
			} else if(rest > 0) {
				String buf = str + (i + " ");
				solve(i, rest, buf);
			}
		}
	}
}