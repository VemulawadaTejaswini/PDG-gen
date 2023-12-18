import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		char[]s = stdIn.next().toCharArray();
		int zero = 0;
		int one = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i]=='0') {
				zero++;
			}else {
				one++;
			}
		}
		
		System.out.println(Math.min(zero, one)*2);
		
		
	}

}
