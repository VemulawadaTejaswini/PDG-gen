import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		int cnt=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='1')cnt++;
		}
		System.out.println(cnt);
	}
}
