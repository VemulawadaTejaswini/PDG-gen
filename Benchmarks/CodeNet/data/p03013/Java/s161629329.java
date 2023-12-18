import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		long result = 1;
		long CONST_BIG_VALUE = 1000000007l;
		long currentPattern =0;

		int prevA =0;

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			list.add(a-prevA);
			prevA =a;
		}
		list.add(n-prevA);

		for (int i = 0; i <= m; i++) {
			int currentDistance = list.get(i);
			if (currentDistance == 1 && i!=0) {
				result = 0;
				// System.out.println("currentDistance 0 case ");
				break;
			}
			result = (result*calcPattern(currentDistance-1)) % CONST_BIG_VALUE;
			// System.out.println("currentDistance-1 " + (currentDistance-1));
			// System.out.println("result " + result);
		}
		System.out.println(result);

	}

	private static long calcPattern(int distance){
		long result = 0;
		boolean flag =true;
		int childDistance =distance;
		while(flag){
			if(childDistance<0){
				flag =false;
				break;
			}
			result += calcNumOfCombination(distance, childDistance);
			distance--;
			childDistance -= 2;
			// System.out.println("calcPattern result " + result);
		}

		return result;
	}

	private static long calcNumOfCombination(int n, int r){
		long num = 1;
		if(r==0){
			return 1;
		}
        for(int i = 1; i <= r; i++){
            num = factorial(n)/(factorial(r) * factorial(n-r));
        }
		// System.out.println("calcNumOfCombination n " + n);
		// System.out.println("calcNumOfCombination r " + r);
		// System.out.println("calcNumOfCombination num " + num);
        return num;
	}
	
	private static long factorial(int n){
		if(n<0){
			return n;
		}
		if(n==0){
			return 1;
		}
		return n * factorial(n-1);
	}

}
