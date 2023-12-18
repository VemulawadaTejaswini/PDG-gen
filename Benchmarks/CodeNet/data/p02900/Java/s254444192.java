import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final long A = scan.nextLong();
		final long B = scan.nextLong();
		scan.close();
		LinkedList<Long> primeNumsA = new LinkedList<Long>();
		LinkedList<Long> primeNumsB = new LinkedList<Long>();
		// 素数を計算する
		primeNumsA = getPrimeNums(A);
		primeNumsB = getPrimeNums(B);

		// AとBを素因数分解する
		LinkedList<Long> primeFactorsA = primeFactorization(A,primeNumsA);
		LinkedList<Long> primeFactorsB = primeFactorization(B, primeNumsB);

		// 素因数の共通項を求める
		long result = countCommonTerm(primeFactorsA,primeFactorsB) + 1;
		System.out.println(result);

	}

	// nまでの素数を計算するメソッド
	private static LinkedList<Long> getPrimeNums(long n){
		LinkedList<Long> primeNums = new LinkedList<Long>();
		// 2からnまでの整数を並べる
		for(long i = 2; i <= n; i++) {
			primeNums.add(i);
		}
		long sqrt = (long)Math.sqrt(n);
		int index = 0;
		long p = 2;
		int i = 0;
		// pがnの平方根を超えたら終了。
		while(p < sqrt) {
			// 生き残っている数の中で一番小さいかつまだpとして使われていないものを
			// 　新たにpとおき、p以外のpの倍数を全て消していく
			i = index + 1;
			while(i < primeNums.size()) {
				if(primeNums.get(i) % p == 0) {
					// 要素を削除
					primeNums.remove(i);
				}else {
					i++;
				}
			}
			index++;
			p = primeNums.get(index);
		}
		return primeNums;
	}

	// 素因数分解をするメソッド
	private static LinkedList<Long>primeFactorization(long n ,LinkedList<Long> primeNums) {
		LinkedList<Long> primeFactor = new LinkedList<Long>();
		int indexPrimeNums = 0;
		long primeNum = 0;
		while(n != 1) {
			primeNum = primeNums.get(indexPrimeNums);
			if(n % primeNum == 0) {
				if(!primeFactor.contains(primeNum)){
					primeFactor.add(primeNum);

				}
				n /= primeNum;
			}else {
				indexPrimeNums++;
			}
		}
		return primeFactor;
	}

	// 共通項の個数を求めるメソッド
	private static long countCommonTerm(LinkedList<Long> a, LinkedList<Long> b) {
		int indexA = 0;
		int indexB = 0;
		long countCommonTerm = 0;
		int sizeA = a.size();
		int sizeB = b.size();;

		while(indexA < sizeA && indexB < sizeB) {
			if(a.get(indexA) == b.get(indexB)) {
				countCommonTerm++;
				indexA++;
				indexB++;
			}else {
				if(a.get(indexA) < b.get(indexB)) {
					indexA++;
				}else {
					indexB++;
				}
			}
		}
		return countCommonTerm;
	}

}
