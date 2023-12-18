import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		ArrayList<Long> minusAry = new ArrayList<Long>();
		ArrayList<Long> plusAry = new ArrayList<Long>();

		for (int i=0; i<N; i++){
			long A = sc.nextLong();
			if (A <= 0){
				minusAry.add(A);
			} else {
				plusAry.add(A);
			}
		}
		int minusPair = minusAry.size() * plusAry.size();
		ArrayList<Long> sekiAry = new ArrayList<Long>();

		if (minusPair >= K){
			for (int i=0; i<minusAry.size(); i++){
				for (int j=0; j<plusAry.size(); j++){
					sekiAry.add(minusAry.get(i) * plusAry.get(j));
				}
			}
			Collections.sort(sekiAry);
			System.out.println(sekiAry.get(K-1));
		} else {
//			for (int i=0; i<plusAry.size(); i++){
//				for (int j=i+1; j<plusAry.size(); j++){
//					sekiAry.add(plusAry.get(i) * plusAry.get(j));
//				}
//			}
//			for (int i=0; i<minusAry.size(); i++){
//				for (int j=i+1; j<minusAry.size(); j++){
//					sekiAry.add(minusAry.get(i) * minusAry.get(j));
//				}
//			}
//			Collections.sort(sekiAry);
//			System.out.println(sekiAry.get(K - minusPair -1));
		}


	}
}