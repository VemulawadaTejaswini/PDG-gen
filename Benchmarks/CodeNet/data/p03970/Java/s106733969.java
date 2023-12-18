import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[]s = stdIn.next().toCharArray();
		
		String a = "CODEFESTIVAL2016";
		int cnt = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i)!=s[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
