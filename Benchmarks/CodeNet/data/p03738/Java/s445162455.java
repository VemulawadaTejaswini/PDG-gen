import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String ans = null;
		if(a.length() < b.length()) {
			ans = "LESS";
		}
		else if(a.length() > b.length()) {
			ans = "GREATER";
		}
		else {
			for(int i = 0; i < a.length() ; i++) {
				if(a.charAt(i)>b.charAt(i)) {
					ans = "GREATER";
					break;
				}
				else if(a.charAt(i) < b.charAt(i)) {
					ans ="LESS";
					break;
				}
				else if(a.charAt(i) == b.charAt(i) && i == a.length()-1) {
					ans = "EQUAL";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
