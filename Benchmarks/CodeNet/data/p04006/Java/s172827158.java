import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	
	private static class Slime {
		final int id;
		final int catchTime;
		int gettingTime;
		final int changeTime;
		int changeCount;
		/**
		 * 捕まえる数。
		 */
		int catchCount;
		Slime(int id, int catchTime, int changeTime) {
			super();
			this.id = id;
			this.catchTime = catchTime;
			this.gettingTime = this.catchTime;
			this.changeTime = changeTime;
			this.changeCount = 0;
			this.catchCount = 1;
		}
		
		
	}
	
	public static void main(String[] args) {
		// 入力
		final int n, x;
		final int[] a;
		Slime[] slimes;
		try(Scanner scan = new Scanner(System.in)) {
			n = scan.nextInt();		// 2≤N≤2,000
			x = scan.nextInt();		// 1≤x≤10^9
			a = new int[n];			// 1≤ai≤10^9
			slimes = new Slime[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
				slimes[i] = new Slime(i, a[i], x);
			}
		}
		
		// それぞれの種類のスライムについて、捕まえるのが早いか、違う種類を捕まえて変化させるのが早いか検討。
		// 循環する部分をどう処理するか。
		// 変化させるのは一括処理されるのでさらに短縮される
		// 変化させる回数全てについて探索する
		// 一回でも変化させる余地があれば、変化させる回数が増えても、トータルの時間は増えない。
		
		for (int change = n - 1; change >= 1; change--) {
			for (int i = n * 2 - 1; 0 < i; i--) {
				
				
				int origin = (i - change) < 0 ? (i - change + n) % n : (i - change) % n;
				int target = i % n;	// 検討するスライムのID
				
				if (slimes[target].catchCount != 0 && slimes[target].catchTime > slimes[origin].catchTime + x * change) {
					
					slimes[origin].catchCount += slimes[target].catchCount;
					slimes[target].catchCount = 0;
					slimes[origin].changeCount = Math.max(slimes[target].changeCount + change, slimes[origin].changeCount);
					// slimes
				} else if (i < n) {
					break;
				}
			}
		}
		long result = Arrays.stream(slimes).mapToLong(slime -> (long) slime.catchCount * slime.catchTime).sum() +
				Arrays.stream(slimes).filter(slime -> slime.catchCount != 0)
				.mapToInt(slime -> slime.changeCount).max().getAsInt() * (long) x;
		
		// 出力
		try (PrintWriter out = new PrintWriter(System.out)) {
			out.println(result);
		}

	}

}
