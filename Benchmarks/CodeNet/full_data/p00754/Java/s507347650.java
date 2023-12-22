import java.util.Scanner;


public class Main {
	Scanner in = new Scanner(System.in);
	
	int idx = 0;
	
	String s;
	

	void searchMarukakko() {
		for ( ;idx < s.length(); idx++) {
			if (s.charAt(idx) == ')') {
				marukakko--;
				return;
			}
			else if (s.charAt(idx) == '(') {
				marukakko++;
				idx++;
				searchMarukakko();
			} else if (s.charAt(idx) == '[') {
				kakukakko++;
				idx++;
				searchKakukakko();
			} else if (s.charAt(idx) == ']') {
				marukakko = 100000;
				return;
			}
		} 
	}

	void searchKakukakko() {
		for ( ;idx < s.length(); idx++) {
			if (s.charAt(idx) == ']') {
				kakukakko--;
				return;
			}
			else if (s.charAt(idx) == '(') {
				marukakko++;
				idx++;
				searchMarukakko();
			} else if (s.charAt(idx) == '[') {
				kakukakko++;
				idx++;
				searchKakukakko();
			} else if (s.charAt(idx) == ')') {
				kakukakko = 100000;
				return;
			}
		} 
	}
	
	int kakukakko, marukakko;
	
	void run() {
		while (true) {
			s = in.nextLine();
			if (s.charAt(0) == '.') break;
			
			kakukakko = 0;
			marukakko = 0;
			idx = 0;
			boolean res = true;
			for ( ; idx < s.length(); idx++) {
				if (s.charAt(idx) == '(') {
					marukakko++;
					idx++;
					searchMarukakko();
				} else if (s.charAt(idx) == '[') {
					kakukakko++;
					idx++;
					searchKakukakko();
				} else if (s.charAt(idx) == ')' || s.charAt(idx) == ']') {
					res = false;
					break;
				}
			}
			if (marukakko != 0 || kakukakko != 0) res = false;
			
			System.out.println(res ? "yes" : "no");
		}
	}
	
	public static void main(String args[]) {
		new Main().run();
	}
}