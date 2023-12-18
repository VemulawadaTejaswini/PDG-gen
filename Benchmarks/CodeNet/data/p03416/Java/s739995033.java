import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int cnt = 0;
		for(int i = a; i <= b; i++ ) {
			String s = String.valueOf(i);
			if(s.charAt(0)==s.charAt(s.length()-1) && s.charAt(1) == s.charAt(s.length()-2)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
