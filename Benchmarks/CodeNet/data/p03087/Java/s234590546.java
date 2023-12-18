import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String S = st.nextToken();
		while (Q-->0) {
			st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken())-1, r = Integer.parseInt(st.nextToken()), count = 0;
			String s = S.substring(l, r);
//			System.out.println(s);
			for (int i = 0; i < s.length()-1; i++) if (s.charAt(i) == 'A' && s.charAt(i+1) == 'C') count++;
			System.out.println(count);
		}
	}

}