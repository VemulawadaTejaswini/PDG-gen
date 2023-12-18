import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int K = scn.nextInt();
		int[] arr = new int[K];
		for (int i = 0; i < K; i++) {
			arr[i] = scn.nextInt();
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < K; i++) {
			list.add(arr[i]);
		}
		int ans = N;
		while (true) {
			if (Val(ans, list, K)) {
				System.out.println(ans);
				break;
			}
			ans = ans + 1;
		}
	}
	public static boolean Val(int N, ArrayList<Integer> list, int K) {
		int temp = N;
		while (temp != 0) {
			int a = temp % 10;
			temp /= 10;
			if (list.contains(a)) {
				return false;
			}
		}
		return true;
	}

}
