
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] arr = new int[n][3];
		for(int i = 0; i < n; i++) {
			String str = s.next();
			int sum = 0, min = Integer.MAX_VALUE;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					sum++;
				} else {
					sum--;
				}
				min = Math.min(min, sum);
			}
			arr[i][0] = sum >= 0 ? 1 : -1;
			arr[i][1] = sum;
			arr[i][2] = min;
		}
		Arrays.sort(arr, (A, B) -> (A[0] != B[0] ? B[0] - A[0] : (A[2] != B[2] ? B[2] - A[2] : B[1] - A[1])));
		int curr = 0;
		boolean ans = true;
		for(int i = 0; i < n; i++) {
//			System.out.println(arr[i][0] + " " + arr[i][1] + " " + arr[i][2]);
			if(curr + arr[i][2] < 0) {
				ans = false;
				break;
			} else {
				curr += arr[i][1];
			}
		}
		ans &= curr == 0;
		System.out.println(ans ? "Yes" : "No");
	}

}
