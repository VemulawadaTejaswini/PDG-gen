import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = 0, g = 0;
		for(int i = 0; i < s.length(); i++)
			if(s.charAt(i) == 'g') {
				if(g == 0)
					g++;
				else {
					g--;
					ans++;
				}
			}
			else {
				if(g == 0) {
					ans--;
					g++;
				}
				else
					g--;
			}
		System.out.println(ans);
	}

}