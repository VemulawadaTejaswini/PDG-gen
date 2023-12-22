import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;

public class Main {
	static Prime pm;
	static int passedNum;
	static boolean passedFlag;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		passedFlag = false;
		long dTimeStart, dTimeNow = 0;
		dTimeStart = System.currentTimeMillis();
		ExecutorService executor = Executors.newFixedThreadPool(4);
		pm = new Prime();
		int[] array = new int[3];
		int count;
		int num;
		List<Integer> out = new ArrayList<>(0);
		while (!((array[0] = sc.nextInt()) == 0 & (array[1] = sc.nextInt()) == 0 & (array[2] = sc.nextInt()) == 0)) {
			passedNum = 2;
			num = array[0];
			count = 0;
			while (count != array[2]) {
				if (pm.primeJudge(num)) {
					passedNum = num;
					count++;
				}
				num += array[1];
			}
			out.add(passedNum);
		}
		for (int n : out) {
			System.out.println(n);
		}
	}
	
	static class Prime {
		boolean primeArray[];
		
		public Prime() {
			primeArray = new boolean[(int) Math.sqrt(10E+6)];
			int tmp = 3;
			Arrays.fill(primeArray, true);
			primeArray[0] = false;
			primeArray[1] = false;
			FalseN fn = new FalseN(2);
			fn.start();
			int tmp3 = (int) Math.sqrt(primeArray.length);
			while (tmp3 > tmp) {
				boolean flag = true;
				if (flag = primeJudge(tmp)) {
					fn = new FalseN(tmp);
					fn.start();
				}
				tmp = getTrue(tmp);
			}
		}
		
		public int getTrue(int n) {
			for (int i = n + 2; i < primeArray.length; i += 2) {
				if (primeArray[i]) {
					return i;
				}
			}
			return -1;
		}
		
		public int getLargePrimeNumber() {
			for (int i = primeArray.length - 1; i > 1; i--) {
				if (primeArray[i]) {
					return i;
				}
			}
			return -1;
		}
		
		public boolean primeJudge(long n) {
			passedFlag = false;
			if (n == 1){
				return passedFlag;
			}
			if (n > Math.pow(primeArray.length - 1, 2) || (n % 2 == 0 && n != 2)) {
				return false;
			}
			int tmp = (int) Math.sqrt(n);
			for (int i = 3; i <= tmp; i += 2) {
				if (primeArray[i] && n % i == 0 && n != i) {
					return false;
				}
			}
			return true;
		}
		
		class FalseN extends Thread implements Runnable {
			int tmp;
			
			public FalseN(int tmp2) {
				tmp = tmp2;
			}
			
			public void run() {
				int tmp2;
				for (int i = 2; (tmp2 = tmp * i) < primeArray.length; i++) {
					primeArray[tmp2] = false;
				}
			}
		}
	}
}

