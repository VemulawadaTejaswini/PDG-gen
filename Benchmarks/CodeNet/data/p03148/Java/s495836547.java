import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);

		int[] firstArray = new int[n];
		int[] dupArray = new int[n];
		Set<Integer> syuruiSet = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			String[] td = br.readLine().split(" ");
			int t = Integer.parseInt(td[0]);
			int d = Integer.parseInt(td[1]);
			if (syuruiSet.add(t)) {
				firstArray[i] = d;
			} else {
				dupArray[i] = d;
			}
		}
		br.close();

		Arrays.parallelSort(firstArray);
		Arrays.parallelSort(dupArray);

//		for (int i = 0; i < n - 1; i++) {
//			System.out.print(firstArray[i] + " ");
//		}
//		System.out.println(firstArray[n - 1]);
//		for (int i = 0; i < n - 1; i++) {
//			System.out.print(dupArray[i] + " ");
//		}
//		System.out.println(dupArray[n - 1]);

		long manzokuMax = 0L;
		long oisisa = 0L;
		int firstCnt = k;
		// 初回配列からK個取り出し
		for (int i = n - 1; i >= n - k; i--) {
//			System.out.println("first:" + i);
			if (firstArray[i] > 0) {
				oisisa += firstArray[i];
			} else {
				firstCnt = n - i;
				break;
			}
		}
//		System.out.println("firstCnt:" + firstCnt);
		// K個に足りない場合は残りを重複配列から取り出し
		int i = n - 1;
		for (; i >= n - k + firstCnt; i--) {
//			System.out.println("dup:" + i);
			oisisa += dupArray[i];
		}
		manzokuMax = oisisa + (long) firstCnt * firstCnt;
//		System.out.println(manzokuMax);

		// 重複配列の続きから取り出し＆初回配列から取り出した分を減算
		for (; i >= 0; i--) {
//			System.out.println("first:" + (n - firstCnt));
//			System.out.println("dup:" + i);
			if (dupArray[i] == 0) {
				break;
			}
			oisisa = oisisa - firstArray[n - firstCnt] + dupArray[i];
			firstCnt--;
			long manzoku = oisisa + (long) firstCnt * firstCnt;
//			System.out.println(manzoku);
			if (manzokuMax < manzoku) {
				manzokuMax = manzoku;
			}
		}
		System.out.println(manzokuMax);
	}
}
