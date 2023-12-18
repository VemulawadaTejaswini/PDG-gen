import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static int i = 0;
	public static int result = 0;
	public static BigInteger count = new BigInteger("0");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] n_a = sc.nextLine().split(" ");
		int n = Integer.parseInt(n_a[0]);
		int a = Integer.parseInt(n_a[1]);
		String[] xs = sc.nextLine().split(" ");
		List<Integer> xsInts = new ArrayList<Integer>();

		for (int i = 0; i < xs.length; i++) {
			xsInts.add(new Integer(xs[i]));
		}
		Collections.sort(xsInts);
		Integer[] xsIntsA = xsInts.toArray(new Integer[n]);

		for(int i = 0; i < xsIntsA.length; i++){
			int[] cache = new int[i+1];
			int ceng = -1;
			int cengQuit = i;
			int startPoint = 0;
			result(ceng, cengQuit, startPoint, xsIntsA, cache, a);
		}
		System.out.println(count.toString());
	}

	private static void result(int ceng, int cengQuit, int startPoint, Integer[] xsIntsA, int[] cache,
			int a) {
		ceng++;
		for(int i = startPoint; i < xsIntsA.length; i++){
			cache[ceng] = xsIntsA[i];
			if(ceng == cengQuit){
				if(getSum(cache) % a == 0){
					count = count.add(BigInteger.ONE);
				}
			}
			
			if(ceng < cengQuit){
				startPoint = i + 1;
				result(ceng, cengQuit, startPoint, xsIntsA, cache, a);
			}
		}
	}

	private static int getSum(int[] cache) {
		int sum = 0;
		for(int i = 0; i < cache.length; i++){
			sum += cache[i];
		}
		return sum;
	}
}
