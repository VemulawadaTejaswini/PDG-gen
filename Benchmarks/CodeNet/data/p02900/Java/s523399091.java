import java.math.BigInteger;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		long A = scanner.nextLong();

		long B = scanner.nextLong();

		long max = 0;
		long min = 0;

		if (A > B) {
			max = A;
			min = B;
		} else {
			max = B;
			min = A;
		}

		long saidaiKouyakusu = 0;

		saidaiKouyakusu = yukurido(max, min);

		long ans=0;

		for(int index = 2; index <= saidaiKouyakusu; index++) {
			if(saidaiKouyakusu % index == 0) {
				// 公約数
				if(isPrimeNumber(index)) {
					ans++;
				}
			}
		}

		log(ans + 1);

	}

	private static long yukurido(long max, long min) {

		if (max % min == 0) {
			return min;
		} else {
			return yukurido(min, max % min);
		}

	}

	private static boolean isPrimeNumber( long num ){
		// 1以下は素数ではない
		if ( 1 >= num ) return false;

		// 2の場合は素数
		if ( 2 == num ) return true;

		// 素数判定
		long n = (long)Math.sqrt( num );
		for ( long i = 2; i <= n; ++ i ) {
			// 余り0で割り切れるかを判定
			if ( 0 == ( num % i ) ) return false;
		}

		// numが2～nで割り切れなかったので素数
		return true;
	}

	private static void dfs(int[] treeArray,int parrent, int children) {
		Vector<Vector> aa = new Vector<>();
		Vector<Integer> bb = new Vector<>();
		bb.add(1);
		aa.add(bb);
	}


	/**
	 * バブルソートの交換数を算出
	 * ※転倒数
	 * @param array
	 * @return
	 */
	private static long countSwapBabbleSort(int[] array, int N) {
		long ans = 0;
		int[] binary = new int[N + 1];

		for (int index = 0; index < array.length; index++) {
			ans = ans + (index - sum(binary, array[index]));
			add(binary, array[index], 1);
		}
		return ans;
	}

    //add value at idx on bit O(logN)
	private static void add(int[] bit,int idx,int value) {
        for(int i=idx;i<bit.length;i=i+(i&-i)) {
        	bit[i] += value;
        }
    }

    //return sum [1,idx] O(logN)
	private static long sum(int[] bit,int idx) {
        long ret = 0;
        for(int i=idx;i>0;i-=(i&-i)) {
        	ret += bit[i];
        }
        return ret;
    }

	private static void log(String str) {
		System.out.println(str);
	}

	private static void log(int str) {
		System.out.println(str);
	}

	private static void log(long str) {
		System.out.println(str);
	}

	private static void log(double str) {
		System.out.println(str);
	}

	private static void log(BigInteger str) {
		System.out.println(str);
	}

}

