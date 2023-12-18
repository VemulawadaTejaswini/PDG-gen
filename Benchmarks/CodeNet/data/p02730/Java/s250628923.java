
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int len = s.length();
		String s1=s.substring(0, (len-1)/2);
		String s2=s.substring(((len+3)/2)-1,len);
		boolean ans1=check(s1);
		boolean ans2=check(s2);
		if(ans1&&ans2&&s1.equals(s2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}

	public boolean check(String s) {
		int n = s.length();
		for(int i=0; i<(n)/2; i++) {
			if( s.charAt(i) != (s.charAt(n-1-i))) {
				return false;
			}
		}
		return true;
	}
}
