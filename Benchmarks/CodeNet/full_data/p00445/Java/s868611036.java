
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s;
		while(!(s = sc.nextLine()).isEmpty()){
			if(s.isEmpty()) break;
			char b1 = 0, b2, c = 0;
			int joi = 0;
			int ioi = 0;
			for(int i = 0;i < s.length();++i){
				b2 = b1;
				b1 = c;
				c = s.charAt(i);
				if(b2 == 'J' && b1 == 'O' && c == 'I') ++joi;
				if(b2 == 'I' && b1 == 'O' && c == 'I') ++ioi;
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}
}