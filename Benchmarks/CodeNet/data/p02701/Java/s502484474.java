import java.util.*;
public class Main{
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String t = "";
		int ans = 0;
		int n = s.nextInt();
		for(int i = 0 ; i < n ; i++) {
			String q = s.next();
			String f = " " + q + " ";
			if(!t.contains(f)) {
				ans++;
				t += f;
			}
		}
		System.out.println(ans);
	}
}