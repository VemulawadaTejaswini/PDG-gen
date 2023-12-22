import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			String s = in.nextLine();
			if(s.equals("0")) return;
			long ans = 0;
			for(int i=0;i<s.length();i++) {
				ans += Integer.parseInt(""+s.charAt(i));
			}
			System.out.println(ans);
		}
	}
}