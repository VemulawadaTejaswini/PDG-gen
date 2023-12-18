import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int N = sc.nextInt();
		String[] s = new String[N];
		for(int i = 0; i < N; i++) {
			s[i] = sc.next();
		}

		int M = sc.nextInt();
		String[] t = new String[M];
		for(int i = 0; i < M; i++) {
			t[i] = sc.next();
		}

		for(int i = 0; i < N; i++) {
			int count = 1;
			for(int j = 0; j < N; j++) {
				if(i != j) {
					if(s[i].equals(s[j])) {
						count++;
					}
				}
			}
			for(int j = 0; j < M; j++) {
				if(s[i].equals(t[j])) {
					count--;
				}
			}
			result = Math.max(result, count);
		}

		System.out.println(result);
	}
}
