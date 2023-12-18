import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
	static String s, s2;
	static int[][] memo;
	static BufferedReader br;
	static PrintWriter out;
	static final int uncal = -1;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		s = br.readLine();
		s2 = br.readLine();
		int i = s.length();int j = s2.length();
		memo = new int[i][j];
		for(int[]a:memo)
			Arrays.fill(a, uncal);
		findLCS(0, 0);
		trace(0, 0);
		out.close();
	}
	static int findLCS(int i,int j) {
		if(i == s.length() || j == s2.length())
			return 0;
		if(memo[i][j] != uncal)
			return memo[i][j];
		if(s.charAt(i) == s2.charAt(j))
		{
			return memo[i][j] = 1 + findLCS(i+1, j+1);
		}
		int choice1 = findLCS(i+1, j);
		int choice2 = findLCS(i, j+1);
		return memo[i][j] = Math.max(choice1, choice2);
	}
	static void trace(int i,int j) {
		if(i == s.length() || j == s2.length()) return;
		int opt = findLCS(i, j);
		if(s.charAt(i) == s2.charAt(j) && findLCS(i+1, j+1) == opt-1) {
			out.print(s.charAt(i));
			trace(i+1, j+1);
			return;
		}
		if(findLCS(i+1, j) == opt) {
			trace(i+1, j);
			return;
		}
		if(findLCS(i, j+1) == opt)
			trace(i, j+1);
	}
}
