import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		float x[] = new float[N];
		String u[] = new String[N];

		for (int i=0; i<N; i++) {
			x[i] = sc.nextFloat();
			u[i] = sc.next();
		}

		float sum = 0;
		for (int i = 0; i<N; i++) {
			if ("JPY".equals(u[i])) {
				sum += x[i];
			} else {
				sum += x[i]*380000;
			}
		}

		System.out.println(sum);
	}
}