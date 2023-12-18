import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	static String s, s2;
	static StringBuilder[][] memo;
	static BufferedReader br;
	static PrintWriter out;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(System.out);
		s = br.readLine();
		s2 = br.readLine();
		int i = s.length();int j = s2.length();
		memo = new StringBuilder[i][j];
		out.println(findLCS(0, 0));
		out.close();
	}
	static StringBuilder findLCS(int i,int j) {
		if(i == s.length() || j == s2.length())
			return new StringBuilder();
		StringBuilder ans = memo[i][j];
		if(ans != null)
			return ans;
		ans = memo[i][j] = new StringBuilder();
		if(s.charAt(i) == s2.charAt(j))
		{
			ans.append(s.charAt(i));
			ans.append(findLCS(i+1, j+1));
			return ans;
		}
		
		StringBuilder choice1 = findLCS(i+1, j);
		StringBuilder choice2 = findLCS(i, j+1);
		ans.append(max(choice1, choice2));
		return ans;
	}
	static StringBuilder max(StringBuilder s,StringBuilder s2) {
		if(s.length() > s2.length())
			return s;
		return s2;
	}

}
