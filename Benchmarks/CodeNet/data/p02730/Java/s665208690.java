
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		scan.close();
		char[] s_char =s.toCharArray();
		int check=0;
		//回文か調べる
		for(int i=0;i<s.length()/2;i++) {
			if(s_char[i]!=s_char[s.length()-1-i]) {
				check=1;
				break;
			}
		}

		for(int i=0;i<s.length()/4;i++) {
			if(s_char[i]!=s_char[s.length()/2-1-i]) {
				check=1;
				break;
			}
			if(s_char[s.length()/2+1+i]!=s_char[s.length()-1-i]) {
				check=1;
				break;
			}
		}
		System.out.println((check==1)? "No":"Yes");

	}
}
