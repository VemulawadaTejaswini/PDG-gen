import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder(sc.next());
		int q = sc.nextInt();
		
		int turn = 0;
		int t;
		int f;
		char[] c = new char[1];
		for (int i = 0; i < q; i++) {
			t = sc.nextInt();
			if (t == 1) {
				turn ^= 1;
			} else {
				f = sc.nextInt();
				c[0] = sc.next().charAt(0);
				if (f == 1) {
					if (turn == 0) {
						sb.insert(0, c);
					} else {
						sb.append(c);
					}
				} else {
					if (turn == 0) {
						sb.append(c);
					} else {
						sb.insert(0, c);
					}
				}
				
			}
		}
		
		if (turn == 1) {
			sb = sb.reverse();
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}

}
