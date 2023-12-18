
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 1. 入力データの処理
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		Integer[] A = new Integer[N];
//		for(int i = 0; i < N; i++) {
//			A[i] = sc.nextInt();
//		}
//		sc.close();
		int N = 2;
		Integer[] A = {1000000000,1000000000};

		// 2.N通りのGCDを計算し最大を出力
		printMaxGCD(A, N);

	}

	private static void printMaxGCD(Integer[] A,int N) {
		// 1. N通りのGCDを計算
		// i番目以外のものでGCD計算
		int gcdTmp = 0;
		int gcdMax = 0;
		for(int i = 0; i < N; i++) {
			Integer[] B = generateB(A,N,i);
			gcdTmp = calcGCD(B);
			if(gcdTmp > gcdMax) {
				gcdMax = gcdTmp;
			}
		}
		System.out.println(gcdMax);
	}

	private static Integer[] generateB(Integer[] A, int N, int i) {
		Integer[] B = new Integer[N - 1];
		int counter = 0;
		for(int j = 0; j < N; j++) {
			if(i == j) {
				continue;
			}
			B[counter] = A[j];
			counter++;
		}
		return B;
	}

	private static int calcGCD(Integer[] A) {
		// 2個以下の場合
		if(A.length == 1) {
			return A[0];
		} else if(A.length == 2) {
			return calcGCD2(A[0],A[1]);
		}
		// 3個以上の場合
		int c = A.length;
		int v = A[c-1] % A[c-2];
		if(v == 0) {
			if(c == 2) {
				return A[c-2];
			}
			arrayPop(A);
			return calcGCD(A);
		}

		A[c - 1] = A[c - 2];
		A[c - 2] = v;
		return calcGCD(A);
	}

	private static int calcGCD2(int a, int b) {
		if(b == 0) {
			return a;
		}
		return calcGCD2(b, a % b);
	}

	private static void arrayPop(Integer[] A) {
		List<Integer> list = new ArrayList<>(Arrays.asList(A));
		list.remove(list.size()-1);
		A = (Integer[]) list.toArray(new Integer[list.size()]);
	}

}
