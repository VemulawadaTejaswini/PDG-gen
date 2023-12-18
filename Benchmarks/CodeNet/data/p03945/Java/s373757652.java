import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		System.out.println(solve(s));
	}

	private static int solve(String s) {

		int count = 0;

		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == 'W' && s.charAt(i+1) == 'B') {
				count++;
			}
			else if(s.charAt(i) == 'B' && s.charAt(i+1) == 'W') {
				count++;
			}
		}

		return count;
	}
}
