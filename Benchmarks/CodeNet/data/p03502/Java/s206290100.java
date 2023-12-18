import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tmp = 0;
		String s = String.valueOf(n);
		for (int i = 0; i < s.length(); i++) {
			int j = Integer.parseInt(s.substring(i, i+1));
			tmp += j;
		}
		if (n % tmp == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}