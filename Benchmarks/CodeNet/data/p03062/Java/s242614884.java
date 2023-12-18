import java.util.Scanner;

public class Main {
	private static final boolean TEST = false;
	private static final int TEST_NUM = 3;

	public static void main(String[] args) {
		int N = 0;
		Integer[] A = {};
		Integer[] A1 = {-10,5,4};
		Integer[] A2 = {10,-4,-8,-11,3};
		Integer[] A3 = {-1000000000,1000000000,-1000000000,1000000000,-1000000000,0,1000000000,
				-1000000000,1000000000,-1000000000,1000000000};

		switch(TEST_NUM) {
		case 1:
			N = 3;
			A = A1;
			break;
		case 2:
			N = 5;
			A = A2;
			break;
		case 3:
			N = 11;
			A = A3;
			break;
		default:
				break;
		}
		if(!TEST) {
			Scanner sc = new Scanner(System.in);
			N = sc.nextInt();
			A = new Integer[N];
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			sc.close();
		}
		solve(A, N);
	}

	private static void solve(Integer[] A, int N) {
		// 1. マイナスの数を数える
		int minusNum = countMinus(A,N);

		// 2. 0があるかを調べる
		boolean isIncludeZero = checkIsIncludeZero(A,N);

		// 3. マイナスが偶数または0を含むなら絶対値の総和
		//    それ以外なら絶対値が最小値の数だけマイナスにして総和を求める
		if(minusNum % 2 == 0 || isIncludeZero) {
			printSum(A);
		} else {
			printOddSum(A);
		}
	}

	private static void printSum(Integer[] A) {
		long sum = 0;
		for(int i = 0; i < A.length; i++) {
			sum += Math.abs(A[i]);
		}
		System.out.println(sum);
	}

	private static void printOddSum(Integer[] A) {
		// 1. 絶対値の最小値求める
		int min = Math.abs(A[0]);
		for(int i = 1; i < A.length; i++) {
			if(Math.abs(A[i]) < min) {
				min = Math.abs(A[i]);
			}
		}

		// 2. 最小値以外の和を求めて、最小値を引いたものを出力
		// 対象とする最小値は1つだけ
		boolean flag = false;
		long sum = 0;
		for(int i = 0; i < A.length; i++) {
			// 除外する最小値なら(1度だけ)
			if(Math.abs(A[i]) == min && flag == false) {
				flag = true;
				continue;
			}
			sum += Math.abs(A[i]);
		}
		System.out.println(sum - min);
	}

	private static int countMinus(Integer[] A, int N) {
		int counter = 0;
		for(int i = 0; i < A.length; i++) {
			if(A[i] < 0) {
				counter++;
			}
		}
		return counter;
	}

	private static boolean checkIsIncludeZero(Integer[] A, int N) {
		for(int i = 0; i < A.length; i++) {
			if(A[i] == 0) {
				return true;
			}
		}
		return false;
	}


}
