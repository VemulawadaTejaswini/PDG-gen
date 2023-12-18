
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;
	public static void main(String[] args) {
		// 1. 入力データの処理
//		int N = 100000;
//		Integer[] A = new Integer[N];
//		for(int i = 0; i < N; i++) {
//			A[i] = 100;
//		}
		int N = 3;
		Integer[] A = {12,15,18};
		if(!TEST) {
			Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			A = new Integer[N];
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			sc.close();
		}

		// 2.N通りのGCDを計算し最大を出力
		printMaxGCD(A, N);

	}

	private static void printMaxGCD(Integer[] A, int N) {
		int sample1 = A[0];
		int sample2 = A[1];

		List<Integer> divisors = new ArrayList<>();

		for(int i = 1; i <= sample1; i++) {
			if(sample1 % i == 0) {
				divisors.add(i);
			}
		}

		for(int i = 1; i <= sample2; i++) {
			if(sample2 % i == 0) {
				divisors.add(i);
			}
		}

		int divisorTmp = 0;
		int divisorMax = 0;
		for(Integer divisor : divisors) {
			// n-1個以上割れたら候補
			int counter = 0;
			for(int i = 0; i < A.length; i++) {
				if(A[i] % divisor == 0) {
					counter++;
				}
			}
			if(counter >= A.length - 1) {
				divisorTmp = divisor;
				if(divisorTmp > divisorMax) {
					divisorMax = divisorTmp;
				}
			}
		}
		System.out.println(divisorMax);
	}

}
