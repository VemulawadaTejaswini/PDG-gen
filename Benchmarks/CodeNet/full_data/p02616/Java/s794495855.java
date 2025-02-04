
import java.util.Collections;
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
		Vector<Integer> posZero = new Vector<Integer>();
		Vector<Integer> neg = new Vector<Integer>();

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();

			if(a[i] < 0){
				neg.add(a[i]);
			}
			else{
				posZero.add(a[i]);
			}
		}

		if(n == k){
			long result = 1;

			for(int i = 0; i < n; i++){
				result = result * a[i] % mod;
			}

			System.out.println(result);
			return;
		}



		Collections.sort(posZero, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				// TODO 自動生成されたメソッド・スタブ
				return Math.abs(n2) - Math.abs(n1);
			}
		});

		Collections.sort(neg, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {
				// TODO 自動生成されたメソッド・スタブ
				return Math.abs(n2) - Math.abs(n1);
			}
		});

		if(neg.size() == n && k%2 == 1){
			long result = 1;
			for(int i = 0; i < k; i++){
				result = result * (neg.get(n - i - 1) + mod)%mod;
			}

			System.out.println(result);
			return;
		}

		long result = 1;
		int posIndex = 0;
		int negIndex = 0;
		for(int i = 0; i < k; i++){
			if(i == k - 1 || negIndex >= neg.size()){
				result = result*posZero.get(posIndex)%mod;
			}
			else {
				long tmp1 = posZero.get(posIndex)*posZero.get(posIndex + 1);
				long tmp2 = 0;
				if(negIndex + 2 < neg.size()){
					tmp2 = neg.get(negIndex)*neg.get(negIndex + 1);
				}

				if(tmp1 >= tmp2){
					result = result*posZero.get(posIndex)%mod;
					posIndex++;
				}
				else {
					result = result*(neg.get(negIndex) + mod)*(neg.get(negIndex + 1) + mod)%mod;
					negIndex += 2;
					i++;
				}
			}

//			System.out.println(result);
		}

		System.out.println(result);
	}

}
