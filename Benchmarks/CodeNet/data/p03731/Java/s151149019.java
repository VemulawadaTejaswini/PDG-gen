import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		final int T = sc.nextInt();
		int totalTime = 0;
		int sos = -1; // start of shower
		int eos = -1; // end of shower
		for (int i = 0; i < N; i++) {
			int ti = sc.nextInt();
			if (ti > eos) {
				totalTime += eos - sos;
				sos = ti;
			}
			eos = ti + T;
		}
		totalTime += eos -sos;
		System.out.println(totalTime);
		sc.close();
	}

}
