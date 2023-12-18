import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		
		String ans = "";
		if(A.length() != B.length()) {
			if(A.length() > B.length())
				ans = "GREATER";
			else
				ans = "LESS";
		} else {
			boolean flag = true;
			for(int i = 0;i < A.length();++i) {
				if(A.charAt(i) != B.charAt(i)) {
					if(A.charAt(i) > B.charAt(i))
						ans = "GREATER";
					else
						ans = "LESS";
					flag = false;
				}
				if(!flag)
					break;
			}
			if(flag)
				ans = "EQUAL";
		}
		System.out.println(ans);
	}
}
