import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] map = new int [N];
		for(int i = 0; i < N ; i++) {
			map[i] = sc.nextInt();
		}
		int H1 = map[0];
		int H2 = map[1];
		int answer = 1;

		if(map[0] <= map[1]) {
			answer++;
		}

		for(int j = 2; j < N; j++) {
			if(H1 <= map[j] &&  H2 <= map[j] && map[j-1] <= map[j]) {
				answer++;
			}
		}

		System.out.println(answer);

	}

}
