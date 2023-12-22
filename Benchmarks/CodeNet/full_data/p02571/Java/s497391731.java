import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		char[] slist = s.toCharArray();
		char[] tlist = t.toCharArray();
		int index = 0;
		int count = 0;
		int start = 0;
		boolean judge = false;

		for(int i = 0;i < t.length();i++) {
			if(s.contains("" + tlist[i])) {
				index = s.indexOf("" + tlist[i]);

				if(index == 0 && i == 0) {
					start = i;
					judge = true;
					break;
				}
				if(i <= index && t.length() - i <= s.length() - index) {
					start = i;
					judge = true;
					break;
				}
			}
		}

		if(judge) {
			for(int i = 0;i < t.length();i++) {
				if(slist[index - start] != tlist[i]) {
					count++;
				}
				index++;
			}

			System.out.println(count);
		}else {
			System.out.println(t.length());
		}
	}
}
