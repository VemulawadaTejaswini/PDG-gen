import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String S = reader.next();
		String T = reader.next();
		String ans = "UNRESTORABLE";
		String tmp = S;
		boolean completed = false;
		for (int i = 0; i < S.length(); i++) {
			int num = T.indexOf(S.charAt(i));
			if (num != -1) {
				int Tremain = T.length() - num - 1;
				int Sremain = S.length() - i - 1;
				tmp = S;
				if (Tremain <= Sremain) {
					int current = 0;
					for (int j = num; j < T.length(); j++) {
						char Sch = S.charAt(i + current);
						char Tch = T.charAt(j);
						if (Sch == Tch || Sch == '?') {
							if (i+current == 0) {
								tmp = Tch + tmp.substring(i+current, T.length());
							}
							else if (i+current == tmp.length()) {
								tmp = tmp.substring(0, i+current)+ Tch;
							}
							else {
								tmp = tmp.substring(0, i+current)+ Tch + tmp.substring(i+current, T.length());
							}

						} else {
							break;
						}
						current++;
						if (current == T.length()) {
							completed = true;
							ans = tmp;
							break;
						}
					}
//					System.out.println(completed);
				}
			}
		}
		if (completed) {
			ans = ans.replace('?', 'a');
		}
		System.out.print(ans);
		reader.close();
	}
}



