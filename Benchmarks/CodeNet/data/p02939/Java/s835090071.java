import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		int ans = 1;
		for(int i = 1;i<s.length();i++) {
			if(i==s.length()-2) {
				if(s.charAt(i)==s.charAt(i+1)) {
					i++;
				}
			}else {
				if(s.charAt(i)==s.charAt(i-1)) {
					i++;
				}
			}
			ans++;
		}
		System.out.println(ans);
		scn.close();
	}
}