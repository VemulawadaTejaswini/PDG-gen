import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		char ans[] = {'A', 'G', 'T', 'C'};
		int a = -1;
		StringBuffer ans2 = new StringBuffer();
		String ans3 = "";
		for(int i = 0; i < s.length(); ++i) {
			a = -1;
			for(int j = 0; j < ans.length; ++j) {
				if(s.charAt(i) == ans[j]) {
					ans2.append(s.charAt(i));
					a = 0;
				}
			}
			if(a == -1) {
				if(ans3.length() < ans2.length()) {
					ans3 = ans2.substring(0).toString();
				}
				ans2.delete(0,  ans2.length());
			}
		}
		System.out.println(ans3.length());
	}

}
