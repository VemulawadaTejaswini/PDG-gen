import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.charAt(s.length()-1)=='s') {
			s=s+"es";
		}
		else {
			s+="s";
		}
		System.out.println(s);
	}
}