
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
		for (int r = 0 ; r <= N ; r++) {
			{
				for (int g = 0 ; g <= N ; g++) {
						if(((N - r * R - g * G) / B >= 0) && ((N - r * R - g * G) % B == 0)) {
							answer++;
						}
				}
			}
		}

		//Output
		System.out.println(answer);
	}
}
