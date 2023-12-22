import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		String W	 = in.readLine();
//		int num = Integer.parseInt(W.split(" ")[0]);

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();


		double sec = (H*3600+H*60);

		double jikanKakudo = H*30+M*0.5;
		double hunKakudo = M*6;
		double kakudo = Math.abs(hunKakudo- jikanKakudo);
		double ans = 0;

		if(kakudo == 0){
			ans = Math.abs(A-B);
		}else if(kakudo == 180){
			ans = A+B;
		}else if(kakudo>180) {
			kakudo = 360 - kakudo;
			ans = Math.sqrt(A*A + B*B - 2*A*B*Math.cos(Math.toRadians(kakudo)));
		}else {

			ans = Math.sqrt(A*A + B*B -2*A*B*Math.cos(Math.toRadians(kakudo)));
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
