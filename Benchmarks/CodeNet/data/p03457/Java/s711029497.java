import java.util.Scanner;

class Schedule {
	int t = 0;
	int x = 0;
	int y = 0;
}

public class Main {
	public static void main(String[] args) {

		// 処理対象個数の入力
		Scanner sc = new Scanner(System.in);
		int input_n = sc.nextInt();
		Schedule schedule[] = new Schedule[input_n+1];

		schedule[0] = new Schedule();

		for(int i=1;i<=input_n;i++) {
			schedule[i] = new Schedule();
			schedule[i].t = sc.nextInt();
			schedule[i].x = sc.nextInt();
			schedule[i].y = sc.nextInt();
		}

		sc.close();

		for(int i=1;i<=input_n;i++) {
			int move_time = schedule[i].t - schedule[i-1].t;
			int distance = Math.abs(schedule[i].x - schedule[i-1].x) + Math.abs(schedule[i].y - schedule[i-1].y);

			if(move_time < distance || ((move_time - distance) % 2 == 1)) {
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");

	}

}