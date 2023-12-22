
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String p = scan.next();
		char[] sChar = s.toCharArray();
		char[] pChar = p.toCharArray();
		int count = 0;
		int mistake = 0;
		boolean c = false;
		for(int i = 0 ; i < sChar.length + pChar.length ; i++) {
			for(int j = count ; j < pChar.length ; j++) {
				if(sChar[i%sChar.length] == pChar[j]) {
					++count;
					break;
				}else {
					++mistake;
				}
			}
			if(mistake == pChar.length) {
				count = 0;
				mistake = 0;
			}else if(count == pChar.length) {
				System.out.println("Yes");
				c = true;
				mistake = 0;
				break;
			}
		}
		if(c == false) {
			System.out.println("No");
		}
	}
}