import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String s = scan.next();

		int ans = 0;

		for(int i = 1; i < n; i++) {
			String s1 = "";
			String s2 = "";
			for(int j = 0; j < s.length(); j++) {
				if(j < i) {
					s1 += s.charAt(j);
				} else {
					s2 += s.charAt(j);
				}
			}
			ans = c(ans, b(s1, s2));
		}

		System.out.println(ans);
	}

	static int c(int a, int b) {
		if(a > b) return a;
		return b;
	}

	static int b(String s1, String s2) {
		int count = 0;
		char ans[] = new char[100];

		for(int i = 0; i < s1.length(); i++) {
			for(int j = 0; j < s2.length(); j++) {
				char c = s2.charAt(j);
				if(s1.charAt(i) == c) {
					for(int k = 0; k <= count; k++) {
						if(ans[k] == c) break;
						if(k == count) {
							ans[count] = c;
							count++;
							break;
						}
					}
				}
			}
		}
		return count;
	}
}
