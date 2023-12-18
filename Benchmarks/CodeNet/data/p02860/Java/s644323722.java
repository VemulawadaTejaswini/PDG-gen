import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		String s = null;
		if(N % 2 != 0) {
			System.out.println("No");
			System.exit(0);
		}else {
			s = sc.next();
		}
		int i = 0;
		for(; i < N / 2; i++) {
			sb.append(s.charAt(i));
		}
		String a = sb.toString();
		sb = new StringBuilder();

		for(; i < N; i++) {
			sb.append(s.charAt(i));
		}
		String b = sb.toString();

		if(a.equals(b)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}
}