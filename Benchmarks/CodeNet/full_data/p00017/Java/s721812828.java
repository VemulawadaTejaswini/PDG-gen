import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int diffThe[]  = new int[2];
		int diffThis[] = new int[3];
		int diffThat[] = new int[3];
		String st;
		int count;
		int k;

		diffThe[0]  = 'h' - 't' + 'z';
		diffThe[1]  = 'e' - 'h' + 'z';
		diffThis[0] = 'h' - 't' + 'z';
		diffThis[1] = 'i' - 'h';
		diffThis[2] = 's' - 'i';
		diffThat[0] = 'h' - 't' + 'z';
		diffThat[1] = 'a' - 'h' + 'z';
		diffThat[2] = 't' - 'a';

		while (sc.hasNext()) {
			st = sc.nextLine();
			count = 0;
			k = 0;

			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) != ' ' && st.charAt(i) != '.') {
					count++;
				} else {
					if (count == 3) {
						if (isThe(st, i, diffThe)) {
							k = 't' - st.charAt(i - 3);
							break;
						}
					} else if (count == 4) {
						if (isThis(st, i, diffThis)) {
							k = 't' - st.charAt(i - 4);
							break;
						}
						if (isThat(st, i, diffThat)) {
							k = 't' - st.charAt(i - 4);
							break;
						}
					}
					count = 0;
				}
			}
			for (int i = 0; i < st.length(); i++) {
				if (st.charAt(i) != ' ' && st.charAt(i) != '.') {
					char c = (char)(st.charAt(i) + k);
					c = (char)(('z' < c) ? c - 'z' : c);
					c = (char)((c < 'a') ? c + 'z' : c);
					System.out.print(c);
				} else {
					System.out.print(st.charAt(i));
				}
			}
			System.out.println();
		}
	}

	public static boolean isThe(String st, int i, int diffThe[]) {
		int a;

		a = st.charAt(i - 2) - st.charAt(i - 3);
		a = (a < 0) ? a + 'z' : a;
		if (a == diffThe[0]) {
			a = st.charAt(i - 1) - st.charAt(i - 2);
			a = (a < 0) ? a + 'z' : a;
			if (a == diffThe[1]) {
				return true;
			}
		}
		return false;
	}

	public static boolean isThis(String st, int i, int diffThis[]) {
		int a;

		a = st.charAt(i - 3) - st.charAt(i - 4);
		a = (a < 0) ? a + 'z' : a;
		if (a == diffThis[0]) {
			a = st.charAt(i - 2) - st.charAt(i - 3);
			a = (a < 0) ? a + 'z' : a;
			if (a == diffThis[1]) {
				a = st.charAt(i - 1) - st.charAt(i - 2);
				a = (a < 0) ? a + 'z' : a;
				if (a == diffThis[2]) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean isThat(String st, int i, int diffThat[]) {
		int a;

		a = st.charAt(i - 3) - st.charAt(i - 4);
		a = (a < 0) ? a + 'z' : a;
		if (a == diffThat[0]) {
			a = st.charAt(i - 2) - st.charAt(i - 3);
			a = (a < 0) ? a + 'z' : a;
			if (a == diffThat[1]) {
				a = st.charAt(i - 1) - st.charAt(i - 2);
				a = (a < 0) ? a + 'z' : a;
				if (a == diffThat[2]) {
					return true;
				}
			}
		}
		return false;
	}
}