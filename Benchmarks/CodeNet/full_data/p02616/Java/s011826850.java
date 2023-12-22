

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int mod = 1_000_000_007;

		Integer a[] = new Integer[n];
		Vector<Integer> pos = new Vector<Integer>();
		Vector<Integer> negZero = new Vector<Integer>();

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();

			if(a[i] <= 0){
				negZero.add(a[i]);
			}
			else{
				pos.add(a[i]);
			}
		}

		Arrays.sort(a, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				// TODO 自動生成されたメソッド・スタブ
				return Math.abs(n2) - Math.abs(n1);
			}
		});

		long prev = 0;
		long result = 1;
		int negCount = 0;
		for(int i = 0; i < k; i++){
			prev = result;
			if(a[i] < 0){
				result = result*(a[i] + mod)%mod;
				negCount++;
			}
			else {
				result = result*a[i]%mod;
			}
		}

		if(negCount % 2 == 0){
			System.out.println(result);
			return;
		}
		else {
			for(int i = k; i < n; i++){
				if(a[i] > 0){
					result = prev*a[i]%mod;
					System.out.println(result);
					return;
				}
			}

			result = 1;
			for(int i = 0; i < k; i++){
				result = result*(a[n - i - 1] + mod)%mod;
			}

			System.out.println(result);
			return;
		}
//		Collections.sort(pos, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer n1, Integer n2) {
//				// TODO 自動生成されたメソッド・スタブ
//				return Math.abs(n2) - Math.abs(n1);
//			}
//		});
//
//		Collections.sort(negZero, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer n1, Integer n2) {
//				// TODO 自動生成されたメソッド・スタブ
//				return Math.abs(n2) - Math.abs(n1);
//			}
//		});
//
//		long posProd[] = new long[pos.size()];
//		long negProd1[] = new long[negZero.size()];
//		long negProd2[] = new long[negZero.size()];
//
//		if(pos.size() > 0){
//			posProd[0] = pos.get(0);
//			for(int i = 1; i < posProd.length; i++){
//				posProd[i] = posProd[i - 1]*pos.get(i)%mod;
//				System.out.println(posProd[i]);
//			}
//		}
//
//		if(negZero.size() > 0){
//			negProd1[0] = negZero.get(negZero.size() - 1) + mod;
//			negProd2[0] = negZero.get(0) + mod;
//
//
//			for(int i = 1; i < negProd1.length; i++){
//				negProd1[i] = negProd1[i - 1]*(negZero.get(n - i - 1) + mod)%mod;
//				negProd2[i] = negProd2[i - 1]*(negZero.get(i) + mod)%mod;
//				System.out.println(negProd1[i] + " "+negProd2[i]);
//			}
//		}
//
//		if(negZero.size() == 0){
//			System.out.println(posProd[k - 1]);
//		}
	}

}
