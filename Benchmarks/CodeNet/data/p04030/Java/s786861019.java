import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) =='B') {
				if(ans.length() > 0)
				ans = ans.substring(0,ans.length()-1);
			}else{
				ans += str.charAt(i);
			}
		}
		System.out.println(ans);
	}
}