import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int count=0;
		for(int i=0;i<s.length();i++) {
			if(i%2+'0' == s.charAt(i)) {

			}else {
				count++;
			}

		}

		int countrev=0;
		for(int i=0;i<s.length();i++) {
			if((i+1)%2+'0' == s.charAt(i)) {

			}else {
				countrev++;
			}

		}

		if(count>countrev) {
			System.out.println(countrev);
		}else {
			System.out.println(count);
		}
	}
}
