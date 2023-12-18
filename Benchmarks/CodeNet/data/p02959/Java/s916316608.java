import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int resultSum =0;
		List<Integer> aList = new ArrayList<>(n+1);
		List<Integer> bList = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			// int b = Integer.parseInt(sc.next());
			aList.add(a);
			// bList.add(b);
			// resultSum += b;
		}
		aList.add(Integer.parseInt(sc.next()));
		for (int i = 0; i < n; i++) {
			// int a = Integer.parseInt(sc.next());
			int b = Integer.parseInt(sc.next());
			// aList.add(a);
			bList.add(b);
			resultSum += b;
		}


		// System.out.println("aList " + aList);

		// System.out.println("bList " + bList);

		int prevAmari  = aList.get(n);
		for (int i = n-1; i >= 0 ; i--) {
			// System.out.println("i " + i);

			int b = bList.get(i);
			int ai = aList.get(i);
			int bPower = b;
			if(prevAmari>=0){
				if(bPower>=prevAmari){
					bPower = bPower - prevAmari;
				}else{
					bPower = 0;
				}
			}

			if(bPower >= ai){
				prevAmari =0;
				resultSum -= bPower-ai;
			}else{
				prevAmari = ai - bPower;
			}
			// System.out.println("b " + b);
			// System.out.println("ai " + ai);

			// System.out.println("prevAmari " + prevAmari);
			// System.out.println("bPower " + bPower);
			// System.out.println("resultSum " + resultSum);
		}
		System.out.println(resultSum);


	}

}
