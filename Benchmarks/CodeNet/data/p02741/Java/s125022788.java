import java.util.*;
import java.math.*;
public class Main {
	static int r; 
	static int c;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51";
		s = s.replace(" ", "");
		int k = in.nextInt();
		int cnt =  0; 
		String ans = "";
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ',') {
				cnt += 1;
				continue;
			}
			if(cnt == k - 1) ans += s.substring(i, i + 1);
		}
		System.out.println(ans);
	}
} 
