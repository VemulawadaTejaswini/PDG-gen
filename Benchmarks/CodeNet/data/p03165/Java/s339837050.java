import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static String s, s2;
	static StringBuilder[][] memo;
	static BufferedReader br;
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		s2 = br.readLine();
		int i = s.length();int j = s2.length();
		memo = new StringBuilder[i][j];
		System.out.println(findLCS(0, 0));
	}
	static char randCharacter() {
		return (char) (Math.random()*26+'a');
	}
	static String randString() {
		StringBuilder sb = new StringBuilder();
		int length = (int) (Math.random()*100+1);
		for (int i = 0; i < length; i++) {
			sb.append(randCharacter());
		}
		return sb.toString();
	}
	static String findLCS(int i,int j) {
		if(i == s.length() || j == s2.length())
			return "";
		StringBuilder ans = memo[i][j];
		if(ans != null)
			return ans.toString();
		ans = memo[i][j] = new StringBuilder();
		if(s.charAt(i) == s2.charAt(j))
		{
			ans.append(s.charAt(i));
			ans.append(findLCS(i+1, j+1));
			return ans.toString();
		}
		
		String choice1 = findLCS(i+1, j);
		String choice2 = findLCS(i, j+1);
		ans.append(max(choice1, choice2));
		return ans.toString();
	}
	static String max(String s,String s2) {
		if(s.length() > s2.length())
			return s;
		return s2;
	}

}
