import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String s = sc.next();
		for (int i=0;i<N;i++) {
			if (i==K) {
				System.out.print(s.charAt(i)-'A'+'a');
			} else {
				System.out.print(s.charAt(i));
			}
		}
	}
}
