import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char[] s = br.readLine().toLowerCase().toCharArray();
		char[] p = br.readLine().toLowerCase().toCharArray();
		boolean isExist = false;
		boolean isCheck;

		for (int i = 0; i < s.length; i++) {
			isCheck = false;
			
			if (p[0] == s[i]) isCheck = true;
			
			for (int j = i, ip = 0; isCheck && j <= s.length && ip < p.length; j++, ip++) {
				if (j == s.length)		j = 0;
				if (s[j] != p[ip])		break;
				if (ip == p.length - 1)	isExist = true;
			}
		}
		
		System.out.println(isExist ? "Yes" : "No"); 
	}
}