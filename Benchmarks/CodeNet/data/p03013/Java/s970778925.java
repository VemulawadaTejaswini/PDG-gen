
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static int N;
	public static int[] stair;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int M = sc.nextInt();
		List<Integer> broken = new ArrayList<>();
		boolean impossible = false;
		int tmp = -1;
		for(int i = 1; i < M + 1; i++) {
			int tmp2 = sc.nextInt();
			if(tmp + 1 == tmp2) {
				impossible = true;
				break;
			} else {
				broken.add(tmp2);
			}
		}
		if(!impossible) {
			stair = new int[N + 1];
			for(int i = 1; i < N + 1; i++) {
				stair[i] = 0;
			}
			for(Integer e : broken) {
				stair[e] = 1;
			}
			long ans = Main.Stair(0);
			System.out.println(ans % 1000000007);
		} else {
			System.out.println(0);
		}
	}

	private static long Stair(int n) {
		long count = 0;
		if(n >= N - 1) {
			count = 1;
		} else if(n < N - 1) {
			if(stair[n + 1] == 0) {
				count += Main.Stair(n + 1);
			}
			if(stair[n + 2] == 0) {
				count += Main.Stair(n + 2);
			}
		}
		return count;
	}

}
