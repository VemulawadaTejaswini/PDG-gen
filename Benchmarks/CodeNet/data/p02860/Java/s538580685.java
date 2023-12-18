import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	int N;
	String S;
	public void run() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		S = sc.next();
		if(N % 2 != 0) {
			System.out.println("No");
		} else {
			String s1 = S.substring(0, N/2);
			String s2 = S.substring(N/2, N);
			if(s1.equals(s2)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}
