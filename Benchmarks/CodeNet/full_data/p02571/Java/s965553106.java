import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		int ans = t.length();

		for(int i = 0; i < s.length() - t.length(); i++) {
			int diff = 0;
			for(int x = 0; x < t.length(); x++) {
				if(!t.substring(x, 1).equals(t.substring(i+x,1))) {
					diff++;
				}
			}
			ans = ans <= diff ? ans : diff;
		}

		System.out.println(ans);
	}
}