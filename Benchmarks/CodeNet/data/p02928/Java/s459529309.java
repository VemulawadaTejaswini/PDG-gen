import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int[] test = new int[2000];

//		for(int i = 0; i < 2000; i++) {
//			test[i] = 100;
//		}

		int N = scanner.nextInt();

		long K = scanner.nextInt();

//		long N = scanner.nextLong();
//
//		long ans =0;
//		for(long index=0; index < N; index++) {
//			ans+=index+1;
//		}
//
//		log(ans-N);

		int[] scannerArray = new int[N];

		for (int index = 0; index < N; index++) {
			scannerArray[index] = scanner.nextInt();
		}

		long tmp = countSwapBabbleSort(scannerArray, N);

		long pair = 0;

		for(int indexI = 0; indexI < N; indexI++) {
			for(int indexJ = 0; indexJ < N; indexJ++) {
				if(scannerArray[indexI] > scannerArray[indexJ]) {
					pair++;
				}
			}
		}

		BigInteger pairOfK = BigInteger.valueOf((long)pair)
				.multiply(BigInteger.valueOf((long)K))
				.multiply((BigInteger.valueOf((long)K)).subtract(BigInteger.ONE))
				.divide(BigInteger.valueOf((long)2));
		log(BigInteger.valueOf((long)tmp).multiply(BigInteger.valueOf((long)K)).add(pairOfK)
				.remainder(BigInteger.valueOf((long)1000000007)
				));

//		log((
//				(BigInteger.valueOf((long)tmp)
//				.multiply(BigInteger.valueOf((long)K)
//						))
//				.add((
//						BigInteger.valueOf((long)tmp)
//						.multiply(
//								BigInteger.valueOf((long)K)
//								.multiply(
//										BigInteger.valueOf((long)K)
//										.subtract(BigInteger.ONE)
//										)
//								.divide(BigInteger.valueOf((long)2)
//										)
//								)
//						)))
//				.remainder(
//						BigInteger.valueOf((long)1000000007)
//						)
//				);
	}


	/**
	 * バブルソートの交換数を算出
	 * ※転倒数
	 * @param array
	 * @return
	 */
	private static long countSwapBabbleSort(int[] array, int N) {
		long ans = 0;
		int[] binary = new int[N + 2];

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

