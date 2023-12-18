import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuilder s = new StringBuilder(sc.next());
		StringBuilder t = new StringBuilder(sc.next());
		sc.close();
		
		int snum = 0;
		StringBuilder rs = new StringBuilder(s.reverse());
		
		for (int i = 0; i < N; i++) {
			if (rs.substring(i, i+1).equals(t.substring(i, i+1))) {
				snum++;
			} else {
				break;
			}
		}
		
		System.out.println(N * 2 - snum);

	}
}