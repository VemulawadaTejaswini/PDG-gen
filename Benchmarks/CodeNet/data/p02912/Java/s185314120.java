import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
//		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int M = sc.nextInt();

		long sum = getAnswer(N,M) ;
		System.out.println(sum);
	}

	public long getAnswer(int N, int M) {
		List<Long> A = new ArrayList<Long>() ;


		long sum = 0 ;
		for(int i = 0 ; i < N; i ++) {
			long num = sc.nextLong() ;
			A.add(num);
			sum += num ;
		}


		for(int i = 0 ; i < M ; i ++) {
			Long max = Collections.max(A) ;
			int idx = A.indexOf(max);
			long sa = max - max/2 ;
			A.set(idx, max/2);
			sum -= sa ;
		}

		return sum ;
	}

	void sort(long[] array) {
		for (int i = array.length - 1; 0 < i; i--) {
			if (array[i - 1] > array[i]) {
				// 入れ替え
				long tmp = array[i - 1];
				array[i - 1] = array[i];
				array[i] = tmp;
			}else {
				break ;
			}
		}
	}
}
