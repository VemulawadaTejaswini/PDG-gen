import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static int[][] map;
	static int[][] directions8= {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
	static int[][] directions4= {{-1,0},{1,0},{0,-1},{0,1}};
	static int ans;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			int N = sc.nextInt();
			int M = sc.nextInt();

			if((N|M)==0) {
				break;
			}

			int[] S = new int[M];
			int[] k = new int[M];
			Kaitousha[] maxScores = new Kaitousha[N];
			for(int i = 0; i < N; i++) {
				maxScores[i] = new Kaitousha();
				maxScores[i].idx = i;
			}
			Kaitousha[] minScores = new Kaitousha[N];
			for(int i = 0; i < N; i++) {
				minScores[i] = new Kaitousha();
				minScores[i].idx = i;
			}
			for(int i = 0; i < M; i++) {
				S[i]=sc.nextInt();
				k[i] = sc.nextInt();
				for(int j = 0; j <k[i]; j++) {
					int c = sc.nextInt()-1;
					maxScores[c].score+=S[i];
					if(k[i] == 1) {
						minScores[c].score += S[i];
					}
				}
			}

			Arrays.sort(maxScores, Comparator.reverseOrder());
			Arrays.sort(minScores);

			long ans = maxScores[0].score - minScores[0].score;

			if(maxScores[0].idx == minScores[0].idx) {
				long p1 = maxScores[1].score - minScores[0].score;
				long p2 = maxScores[0].score - minScores[1].score;

				ans = Math.max(p1, p2);

			}
			System.out.println(ans+1);
		}
	}

	//BFS用に二つの配列を足し算する
	static int[] addArrayElms(int[] a, int[] b) {
		int[] c = new int[a.length];
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		return c;
	}

//	//二分探索
	//k <= num となる最小の配列要素kのインデックスを返す
	static private int binarySearch(long num, long[] orderedArray){
		int lowerBorder = -1;
		int upperBorder = orderedArray.length;
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedArray[mid]<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//二分探索
	//k <= num となる最小のList要素kのインデックスを返す
	static private int binarySearch(long num, ArrayList<Long> orderedList){
		int lowerBorder = -1;
		int upperBorder = orderedList.size();
		int mid;

		while(upperBorder - lowerBorder >1) {
			mid = (upperBorder + lowerBorder)/2;
			if(orderedList.get(mid)<=num) {
				lowerBorder = mid;
			}else {
				upperBorder = mid;
			}
		}
		return lowerBorder;
	}

	//aとbの最小公倍数を求める
	public static int gcd(int a, int b) {
		return b == 0 ? a: gcd(b, a % b);
	}
	public static long gcd(long a, long b) {
		return b == 0 ? a: gcd(b, a % b);
	}
}

class Kaitousha implements Comparable<Kaitousha>{
	int idx;
	long score;
	@Override
	public int compareTo(Kaitousha o) {
		if(this.score < o.score) {
			return -1;
		}else if(this.score > o.score){
			return 1;
		}else {
			return 0;
		}
	}
}


