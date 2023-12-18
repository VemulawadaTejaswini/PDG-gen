import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int arr[][] = new int[m][2];
		for (int i=0; i<m; i++){
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}

		arr = sort(arr);

		int ans = 0;
		int begin = 0;
		int end = n;
		for(int i=0; i<m; i++){
			begin = Math.max(begin, arr[i][0]);
			end = Math.min(end, arr[i][1]);
			if (begin>=end) {
				ans++;
				begin = arr[i][0];
				end = arr[i][1];
			}
		}
		ans++;
		System.out.println(ans);

	}

	static int[][] sort(int[][] arr){
		Arrays.sort(arr, (o1, o2) -> {
			if (o1[0] == o2[0]) {
				return o1[1] - o2[1];
			} else {
				return o1[0] - o2[0];
			}
		});
		return arr;
	}

}