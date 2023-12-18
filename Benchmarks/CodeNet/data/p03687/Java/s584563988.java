import java.util.Scanner;

public class Main{
	static boolean check(String str, char c) {
		for(int i = 0; i < str.length(); i++) if(str.charAt(i) != c) return false;
		return true;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		int ans = Integer.MAX_VALUE;

		for(int i = 0; i <= ('z' - 'a'); i++) {
			char goal = (char)('a' + i);
			String now = s;
			int tmp = 0;
			while(!check(now, goal)) {
				String newstr = "";
				for(int j = 0; j + 1 < now.length(); j++) {
					if(now.charAt(j) == goal || now.charAt(j + 1) == goal) newstr += goal;
					else newstr += now.charAt(j);
				}
				now = newstr;
				tmp++;
			}
			ans = Math.min(tmp, ans);
		}
		System.out.println(ans);
	}
}