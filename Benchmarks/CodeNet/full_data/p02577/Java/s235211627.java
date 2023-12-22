import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){


			String S = scan.next();

			char[]s = new char[S.length()];
			s = S.toCharArray();
			int goukei = 0;

			for(int i = 0;i<S.length();i++) {
				goukei+=(s[i]-'0');
			}

			if(goukei%9==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}



		}


	}


}
