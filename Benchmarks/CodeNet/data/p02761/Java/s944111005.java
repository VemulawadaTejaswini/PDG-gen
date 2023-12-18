import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		String[] temp = new String[N];
		for (int i = 0; i < M; i++) {

			int s = sc.nextInt();
			int c = sc.nextInt();

			if(temp[s-1] != null && Integer.parseInt(temp[s-1]) != c) {
				System.out.println(-1);
				return;
			}
			temp[s-1] = String.valueOf(c);
		}

		if(M==0) {
			System.out.println(-1);
			return;
		} else if(temp[0] != null && N>=2 && Integer.parseInt(temp[0]) == 0) {
			System.out.println(-1);
			return;
		}

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < N; i++) {

			if(i == 0 && temp[0] == null && N != 1) {
				result.append("1");
				continue;
			}

			if(temp[i] != null) {
				result.append(temp[i]);
			} else {
				result.append("0");
			}
		}

		int resultInt = Integer.parseInt(result.toString());
		if(N ==1 && resultInt == 0) {
			System.out.println(0);
			return;
		}

		if((int)Math.pow(10, N-1) <= resultInt && (int)Math.pow(10, N) > resultInt) {
			System.out.println(Integer.parseInt(result.toString()));
		} else {
			System.out.println(-1);
		}
	}
}