
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		String s, sw = "", sb = "", tmp2 = "";
		char s1[], tmp;
		boolean e = true;
		
		s = sc.nextLine();
		sc.close();
		tmp = s.charAt(0);
		s1 = new char[s.length()];
		
		for(int i = 0; i < s.length(); ++i) {
			s1[i] = s.charAt(i);
			if(tmp != s1[i])e = false;
			sw += 'W';
			sb += 'B';
		}
		
		if(e)System.out.println(count);
		else {
			while(!e) {
				if(tmp == 'W')tmp = 'B';
				else tmp = 'W';
				
				for(int i = 0; i < s.length(); ++i) {
					if(s1[i]!= tmp)s1[i] = tmp;
					else break;
				}
				tmp2 = String.valueOf(s1);
				if(tmp2.equals(sw)||tmp2.equals(sb))e = true;
				else e = false;
				++count;
			}
			System.out.println(count);
		}
	}
}
