import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String answer = "";

		int naa = a.length();
		int nab = b.length();
		int i = 0;

		if (naa == nab) {

			if (a.equals(b)) {
				answer = "EQUAL";
			} else {
				for (i = 0; i < naa; i++) {
					int q=a.charAt(i)+0;

					int l=b.charAt(i)-0;

					if(q>l) {
						answer = "GREATER";
						break;
					}else if(q<l) {
						answer = "LESS";
						break;
					}

				}
			}

		} else if (naa > nab) {
			answer = "GREATER";
		} else if (naa < nab) {
			answer = "LESS";
		}
		System.out.println(answer);
	}

}
