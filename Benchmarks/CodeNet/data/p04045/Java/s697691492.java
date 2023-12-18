import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		String[] d = new String[K];
		for (int i = 0; i < K; i++) {
			d[i] = in.next();
		}
		int num = N;
		while (true) {
			String s = String.valueOf(num);
			boolean isOk = true;
			for (int i = 0; i < d.length; i++) {
				if (s.contains(d[i])) {
					num++;
					isOk = false;
					break;
				}
			}
			if (isOk) {
				System.out.println(num);
				break;
			}
		}
		in.close();
	}
}