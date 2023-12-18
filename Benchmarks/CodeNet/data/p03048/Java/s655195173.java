import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Input
		Scanner sc = new Scanner(System.in);
		int R = Integer.parseInt(sc.next());
		int G = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		int N = Integer.parseInt(sc.next());
		sc.close();

		//Logic
		int answer = 0;
		for (int r = 0 ; r <= N/R ; r++) {
			for (int g = 0 ; g <= N/G ; g++) {
				for (int b = 0 ; b <= N/B ; b++) {
					if(r * R + g * G + b * B > N) {
						continue;
					}
					if(r * R + g * G + b * B == N) {
						answer++;
					}
				}
			}
		}

		//Output
		System.out.println(answer);
	}
}
