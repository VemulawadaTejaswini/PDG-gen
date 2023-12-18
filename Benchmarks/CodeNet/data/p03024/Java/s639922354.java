import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int sumLose = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'x')
				sumLose++;
		}

		String ans = sumLose <= 7 ? "YES" : "NO";
		System.out.println(ans);
		sc.close();
	}

}
