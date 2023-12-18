import java.util.*;
public class Main {
	static String[] s;
	public static boolean isok(int i) {
		if(s[i].equals("A") || s[i].equals("G") || s[i].equals("C") || s[i].equals("T"))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		s = S.split("");
		int answer = 0;
		int[] ans = new int[s.length];
		for(int i = 0; i < s.length; i++) {
			if(isok(i))
				answer += 1;
			else {
				ans[i] = answer;
				answer = 0;
			}
		}
		answer = 0;
		for(int i = 0; i < s.length; i++) 
			if(answer < ans[i]) answer = ans[i];
		System.out.println(answer);
	}

}