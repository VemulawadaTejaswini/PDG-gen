import java.util.HashSet;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		HashSet<Integer> chosedBefore = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (!chosedBefore.contains(array[i])) {
				chosedBefore.add(array[i]);
				int chosen = array[i];
				int result = 0;
				for (int j = 0; j < n; j++) {
					if (array[j] - array[i] == 1 || array[j] - array[i] == 0
							|| array[j] - array[i] == -1) {
						result++;
					}
				}
				ans = Math.max(ans, result);
			}

		}
		System.out.println(ans);

	}

}
