import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//		String W	 = in.readLine();
		//		int num = Integer.parseInt(W.split(" ")[0]);

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 1;
		long INF = 1000000000000000000L;
		for(int i =0;  i<N ;i++) {
			ans *=sc.nextLong();
			if(ans > INF) {
				ans = -1;
				break;
			}
		}



		System.out.println(ans);

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
