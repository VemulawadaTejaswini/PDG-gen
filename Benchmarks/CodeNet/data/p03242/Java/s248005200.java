import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String ans = "";
		for(int i = 0; i < n.length(); i++) {
			if(n.substring(i, i + 1).equals("1")) {
				ans += "9";
			} else if(n.substring(i, i + 1).equals("9")){
				ans += "1";
			} else {
				ans += n.substring(i, i + 1);
			}
		}
		System.out.println(ans);
	}
}
