import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String n = sc.next();
		String s[] = new String[N];
		for (int i = 0; i < N; i++) {
			s[i] = n.substring(i, i+1);
		}
		Integer min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			for (int j = 0; j < i; j++) {
				if (s[j].equals("W")) {
					cnt++;
				}
			}
			for (int j = i+1; j < N; j++) {
				if(s[j].equals("E")) {
					cnt++;
				}
			}
			if (cnt < min) {
				min = cnt;
			}
		}
		System.out.println(min);
	}
}
