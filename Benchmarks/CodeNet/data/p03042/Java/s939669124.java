import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		if(check(s[0],s[1])) {
			if(check(s[2],s[3])) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(check(s[2],s[3])) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}
	}
	
	public static boolean check(char a, char b) {
		int ch = (Character.getNumericValue(a))*10
				    +(Character.getNumericValue(b));
		if(1 <= ch && ch <= 12) {
			return true;
		}else {
			return false;
		}
	}
}