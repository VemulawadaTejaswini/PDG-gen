import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		scan.close();
		if(S.equals(T)) {
			System.out.println("Yes");
			System.exit(0);
		}

		String []t = new String[S.length()];
		Deque<String> q1 = new ArrayDeque<String>();

		for(int i = 0; i < S.length(); i++) {
			t[i] = T.substring(i, i + 1);
			q1.addLast(S.substring(i, i + 1));
		}

		int flag = 1;
		for(int i = 0; i < S.length(); i++) {
			flag = 1;
			String te = q1.pollLast();
			q1.addFirst(te);
			//disp(q1);
			int index = 0;
			for(String s1 : q1) {
				if(!s1.equals(t[index])) {
					flag = 0;
					break;
				}
				index ++;
			}
			if(flag == 1) {
				System.out.println("Yes");
				System.exit(0);
			}

		}

		System.out.println("No");
	}
	static void disp(Deque<String> q1) {
		for(String s : q1) {
			System.out.print(s);
		}
		System.out.println();
	}
}