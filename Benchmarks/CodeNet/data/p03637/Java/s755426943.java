package sample.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nStr = "";
		List<Integer> a = new ArrayList<Integer>();
		try(Scanner sc = new Scanner(System.in)){
			// N入力
			System.out.println("Please Input N");
			nStr = sc.nextLine();
			// aスペース区切り入力
			System.out.println("Please Input a");
			String aIn = sc.nextLine();
			for(String aStr : aIn.split(" ")) {
				a.add(Integer.valueOf(aStr));
			}
		}
		
		int n = Integer.valueOf(nStr);
		// 前提
		if(n != a.size()) {
			return;
		}
		
		// a要素の4の倍数カウント
		int cnt4 = 0;
		// a要素の2の倍数カウント
		int cnt2 = 0;
		for(int i = 0; i < n; i++) {
			
			// 要素が4の倍数
			if(a.get(i) % 4 == 0) {
				cnt4++;
			}
			// 要素が2の倍数
			else if(a.get(i) % 2 == 0) {
				cnt2++;
			}
		}
		// 2の倍数の数を要素数から排除
		n -= cnt2;
		
		// 2の倍数が存在した
		if(cnt2 != 0){
			// 偶数
			if(n % 2 == 0) {
				// 4の倍数が要素の半分以上
				if((n /2) <= cnt4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}				
			} else {
				// 4の倍数が要素の半分より上
				if((n /2) < cnt4) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}				
			}
		} else {
			// 4の倍数が要素の半分以上
			if((n /2) <= cnt4) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
