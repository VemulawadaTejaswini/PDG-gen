
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);) {
			String[] recA = br.readLine().split(" ");
			String[] recB = br.readLine().split(" ");
			long A = Long.parseLong(recA[0]);
			long B = Long.parseLong(recB[0]);
			long V = Long.parseLong(recA[1]);
			long W = Long.parseLong(recB[1]);
			long T = Long.parseLong(br.readLine());
			long d = -1;
			long s = V - W;
			if (s == 0) {
				System.out.println("NO");
				return;
			}
			while (d != 0 && T > 0)
				if (A < B) {
					d = B - A;
					if (d % s == 0) {
						if (d <= T * s) {
							System.out.println("YES");
							return;
						} else {
							System.out.println("NO");
							return;
						}
					} else {
						long k = d / s + 1;
						A += k * V;
						B += k * W;
						T -= k;
					}
				} else {
					d = A - B;
					if (d % s == 0) {
						if (d <= T * s) {
							System.out.println("YES");
							return;
						} else {
							System.out.println("NO");
							return;
						}
					} else {
						long k = d / s + 1;
						A -= k * V;
						B -= k * W;
						T -= k;
					}
				}
			System.out.println("NO");
		}
	}

}
