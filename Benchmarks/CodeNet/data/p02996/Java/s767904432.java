import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		class Task{
			int A;
			int B;

			public Task(int A, int B) {
				this.A = A;
				this.B = B;
			}

			int getA() {
				return A;
			}

			int getB() {
				return B;
			}
		}

		int N = sc.nextInt();
		Task[] tasks = new Task[N];

		for(int i=0; i<N; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			tasks[i] = new Task(A, B);
		}

		sc.close();

		Arrays.sort(tasks, Comparator.comparing(Task::getB));

		String ans = "Yes";
		int time = 0;
		for(int i=0; i<N; i++) {
			int A = tasks[i].getA();
			int B = tasks[i].getB();

			if(time + A > B) {
				ans = "No";
				break;
			}

			time += A;
		}

		System.out.println(ans);
	}

}

