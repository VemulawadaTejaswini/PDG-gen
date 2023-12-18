import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		List<Long> list = new ArrayList<>();
		List<Long> sumList = new ArrayList<>();

		long tempSum =0;
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			list.add(a);
			tempSum +=a;
			sumList.add(tempSum);
		}
		// System.out.println("list " + list);

		// start from minus

		long minusSum =0;
		int minusCount =0;
		for (int i = 0; i < n; i++) {
			long a = list.get(i);
			// System.out.println("a  " + a );
			minusSum += a;
			// System.out.println("minusSum " + minusSum);

			if(minusSum>=0 && i%2==0){
				long diff = calcDiff(minusSum);
				minusCount += diff;
				// minusSum -= diff;
				minusSum = -1;
				// System.out.println("diff " + diff);
				// System.out.println("minusSum " + minusSum);
			}
			if(minusSum<=0 && i%2==1){
				long diff = calcDiff(minusSum);
				minusCount += diff;
				// minusSum += diff;
				minusSum = 1;
				// System.out.println("diff " + diff);
				// System.out.println("minusSum " + minusSum);
			}
			// System.out.println();
		}

		// start from plus
		long plusSum =0;
		int plusCount =0;
		for (int i = 0; i < n; i++) {
			long a = list.get(i);
			plusSum += a;
			// System.out.println("plusSum " + plusSum);

			if(plusSum<=0 && i%2==0){
				long diff = calcDiff(plusSum);
				plusCount += diff;
				// plusSum += diff;
				plusSum = 1;
				// System.out.println("diff " + diff);
				// System.out.println("plusSum " + plusSum);
			}
			if(plusSum>=0 && i%2==1){
				long diff = calcDiff(plusSum);
				plusCount += diff;
				// plusSum -= diff;
				plusSum = -1;
				// System.out.println("diff " + diff);
				// System.out.println("plusSum " + plusSum);
			}
			// System.out.println();
		}
		// System.out.println("minusCount " + minusCount);
		// System.out.println("plusCount " + plusCount);


		System.out.println(Math.min(minusCount,plusCount));

	}

	private static long calcDiff(long sum){
		return sum==0? 1 : Math.abs(sum)+1;
	}
}

