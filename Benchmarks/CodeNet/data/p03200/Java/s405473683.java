import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main{

	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner();
		PrintWriter pw=new PrintWriter(System.out);
		String s=sc.next();
		int i=0;
		long rta=0;
		for (int j = 0; j < s.length(); j++) {
			if(s.charAt(j)=='W'){
				rta+=j-i;
				i++;
			}
		}
		pw.println(rta);
		pw.close();
		
	}
	static class Scanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		int spaces = 0;

		public String nextLine() throws IOException {
			if (spaces-- > 0) return "";
			else if (st.hasMoreTokens()) return new StringBuilder(st.nextToken("\n")).toString();
			return br.readLine();
		}

		public String next() throws IOException {
			spaces = 0;
			while (!st.hasMoreTokens()) st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public boolean hasNext() throws IOException {
			while (!st.hasMoreTokens()) {
				String line = br.readLine();
				if (line == null) return false;
				if (line.equals("")) spaces = Math.max(spaces, 0) + 1;
				st = new StringTokenizer(line);
			}
			return true;
		}
	}
}