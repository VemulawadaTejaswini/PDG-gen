import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		String ans = "";
		for(int i = 0;i < s.length();++i) {
			switch(s.charAt(i)) {
			case '0':
			case '1':
				ans = ans + s.charAt(i);
				break;
			case 'B':
				if(ans.length() > 0)
					ans = ans.substring(0, ans.length()-1);
				break;
			}
		}
		System.out.println(ans);
	}
}
