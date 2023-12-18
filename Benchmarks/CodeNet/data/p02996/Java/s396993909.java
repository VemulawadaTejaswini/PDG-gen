import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();

		int[] tasks = new int[N];
		int[] deadLines = new int[N];
		boolean[] isFinished = new boolean[N];

		for (int i = 0; i < N; i++) {
			tasks[i] = s.nextInt();
			deadLines[i] = s.nextInt();
			isFinished[i] = false;
		}


		int taskSum = 0;

		for(int i = 0;i<N;i++) {
			int taskIndex = getMinIndex(deadLines, isFinished);

			taskSum += tasks[taskIndex];

			if(taskSum <= deadLines[taskIndex]) {
				isFinished[taskIndex] = true;
			}else {
				System.out.println("No");
				return;
			}

		}

		System.out.println("Yes");

	}


	public static int getMinIndex(int[] array, boolean[] isFinished ) {

		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 0;i<array.length;i++) {

			if(isFinished[i]) continue;

			if(array[i] < min) {
				min = array[i];
				minIndex = i;
			}
		}

		return minIndex;

	}
}
