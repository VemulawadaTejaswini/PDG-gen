import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		String ans = "No";
		if(t.length()==s.length()+1) {
			String temp = t.substring(0,t.length()-1);
			if(temp.equals(s)) {
				ans = "Yes";
			}
		}
		System.out.println(ans);
	}
}