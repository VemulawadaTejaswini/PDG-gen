import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if(s.substring(i, i+1).equals("0")) {
				ans.append("0");
			}
			else if(s.substring(i, i+1).equals("1")) {
				ans.append("1");
			}
			else if(s.substring(i, i+1).equals("B")) {
				if(ans.length()>0) {
					ans.delete(ans.length()-1,ans.length());
				}
			}
		}
		System.out.println(ans);
	    scanner.close();
		}
}
