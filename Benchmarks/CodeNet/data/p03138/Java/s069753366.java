import java.util.*;
import java.math.*;
import java.lang.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long n = sc.nextLong();
		long k = sc.nextLong();
		List<Long> list = new ArrayList<>();
		long curSum =0;
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			list.add(a);
			curSum +=a;
		}
		if(k ==0){
			System.out.println(curSum);

		}else{


		String length = Long.toBinaryString(k);

		//debug
		// System.out.println(length);
		// System.out.println(length.length());
		// 0とのxorした結果
		// 1桁ずつ攻めていく
		
		List<Integer> digitsList = new ArrayList<>();

		for (int i = 0; i < length.length(); i++) {
			// i はi桁目を表す
			long pair = (long)Math.pow(2,i);
			System.out.println("pair"+pair);

			long tempSum=0;
			for (int j = 0; j < n; j++) {
				tempSum += xor(list.get(j),pair);
			}
			System.out.println("tempSum"+tempSum);
			if(tempSum > curSum){
				digitsList.add(i);
			}
		}

		long resultK = 0;
		for(int digit:digitsList){
			resultK += (long)Math.pow(2,digit);
		}

		//debug
		System.out.println(digitsList);
		System.out.println(resultK);

		long result =0;
		for (int j = 0; j < n; j++) {
			result += xor(list.get(j),resultK);
		}
		System.out.println(result);
	}
	}

	private static long xor(long x, long a) {
		return x ^ a;
	}

}
