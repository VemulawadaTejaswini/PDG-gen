import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		String s = readLine();
      	boolean p = true;
      	int n = s.length();
      	for(int i = 0; i<n; i++){
          	if(s.charAt(i)!=s.charAt(n-i-1))p = false;
        }
      	int n2 = (n-1)/2;
      	for(int i = 0; i<n2; i++)
          	if(s.charAt(i)!=s.charAt(n2-i-1))p = false;
      	int n3 = (n+3)/2 - 1;
      	for(int i = n3; i<n; i++)
          	if(s.charAt(i)!=s.charAt(n-(i-n3)-1))p = false;
      	if(p)System.out.println("Yes");
      	else System.out.println("No");
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}