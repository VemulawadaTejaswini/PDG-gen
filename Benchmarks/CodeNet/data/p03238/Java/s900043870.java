import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int T = sc.nextInt();

		int answer = 1001;

		System.out.println("n:" + n + " " + "T:" + T);

		for(int i = 0; i < n; i++) {

			int c = sc.nextInt();
			int t = sc.nextInt();

			if(c<answer && t <= T) {
				answer = c;
			}
		}

		if(answer == 1001) {
			System.out.println();
		}else {
			System.out.println("TLE");
		}
	}
}
