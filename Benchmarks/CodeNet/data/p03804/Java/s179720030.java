import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(),M = sc.nextInt();
		String[] ns = new String[N];
		String[] ms = new String[M];
		for(int i = 0;i < N;i++) {
			ns[i] = sc.next();
		}
		for(int i = 0;i < M;i++) {
			ms[i] = sc.next();
		}

		int count = 0;
		int position = -1;
		int oldPosition = -1;
		for(int i = 0; i < N; i++) {
			String nline = ns[i];
			String mline = ms[count];
			oldPosition = position;
			position = nline.indexOf(mline);

			if(position == -1) {
				count = 0;
				continue;
			}

			if(count > 0 && position != oldPosition) {
				count = 0;
				continue;
			}

			count++;
			if(count == M) break;
		}
		if(count == M) System.out.println("Yes");
		else System.out.println("No");
	}
}