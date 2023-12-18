import java.util.Scanner;

public class Main{
	static long mod = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ans = 0;
		for(int i = 0; i < S.length(); i++) {
			for(int j = i + 1; j < S.length() + 1; j++) {
				String subS = S.substring(i, j);
				boolean isATGC = true;
				for(int k = 0; k < subS.length(); k++) {
					char c = subS.charAt(k);
					if(c == 'A' || c == 'T' || c == 'G' || c == 'C') continue;
					isATGC = false;
				}
				if(isATGC) ans = Math.max(ans, subS.length());
			}
		}
		System.out.println(ans);
	}
}
