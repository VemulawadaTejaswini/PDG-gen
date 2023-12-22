import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		long[] S = new long[N];

		for (int i = 0; i < N; i++) {
			S[i] = scan.nextLong();
		}

		sort(S, 0, S.length - 1);

		long[] newS = new long[N];
		for (int i = 0; i < N; i++) {
			newS[i] = S[N - i - 1];
		}

		//WK変数
		long result = newS[0];

		//演算
		if (N % 2 == 0) {
			for (int i = 1; i <= N / 2 - 1; i++) {
				result += 2L * newS[i];
			}
		} else {
			for (int i = 1; i < (N - 1) / 2; i++) {
				result += 2L * newS[i];
			}
			result += newS[(N - 1) / 2];

		}

		//結果出力
		System.out.println(result);
	}


    public static void sort(long[] array, int left, int right){
        if(left <= right){
            long p = array[(left + right) >>> 1];
            int l = left;
            int r = right;
            while(l <= r){
                while (array[l] < p){
                    l ++;
                }
                while (array[r] > p){
                    r --;
                }
                if (l <= r){
                    long tmp = array[l];
                    array[l] = array[r];
                    array[r] = tmp;
                    l++ ;
                    r-- ;
                }
            }
            sort(array, left, r);
            sort(array, l, right);
        }
    }
}