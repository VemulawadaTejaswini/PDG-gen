import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Main main = new Main();
		main.solveB();
	}

	private void solveB() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] count = new int[N];
		for (int i = 0; i < M; i++) {
			count[sc.nextInt() - 1]++;
			count[sc.nextInt() - 1]++;
		}
		int oddNum = 0;
		for (int num : count) {
			if (num % 2 == 1) {
				oddNum++;
			}
		}
		if (oddNum > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}