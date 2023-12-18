import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextInt();
		}

		int cnt=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if(sumArr(A, i, j)==xorArr(A, i, j)) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}

	private static int sumArr(int[] Arr,int startIdx, int endIdx) {
		int sum =0;
		for(int i = startIdx;i<=endIdx;i++) {
			sum += Arr[i];
		}
		return sum;
	}

	private static int xorArr(int[] Arr,int startIdx, int endIdx) {
		int xorSum = Arr[startIdx];
		for(int i = startIdx+1;i<=endIdx;i++) {
			xorSum = xorSum ^ Arr[i];
		}
		return xorSum;
	}

}
