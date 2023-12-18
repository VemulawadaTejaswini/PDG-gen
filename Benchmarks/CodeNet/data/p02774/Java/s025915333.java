import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		List<Long> plus = new ArrayList<Long>();
		List<Long> minus = new ArrayList<Long>();
		List<Long> zero = new ArrayList<Long>();
		
		for(int i = 0; i < n; i++) {
			long a = scan.nextLong();
			if(a > 0) {
				plus.add(a);
			} else if(a == 0) {
				zero.add(a);
			} else {
				minus.add(a);
			}
		}
		
		int zeroCount = zero.size() * (plus.size() + minus.size()) + (zero.size() * (zero.size()-1))/2;
		int minusCount = plus.size() * minus.size();
		
		if(k <= minusCount) {
			minusProduct(plus, minus, k);
			return;
		} else if(minusCount < k && k <= minusCount + zeroCount){
			System.out.println(0);
			return;
		} else {
			plusProduct(plus, minus, k - (minusCount + zeroCount));
		}
	}
	
	public static void plusProduct(List<Long> plus, List<Long> minus, int k) {
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < plus.size() - 1; i++) {
			for(int j = i +1; j < plus.size();j++) {
				list.add(plus.get(i) * plus.get(j));
			}
		}
		for(int i = 0; i < minus.size() - 1; i++) {
			for(int j = i +1; j < minus.size();j++) {
				list.add(minus.get(i) * minus.get(j));
			}
		}
		Collections.sort(list);
		System.out.println(list.get(k-1));
	}
	
	public static void minusProduct(List<Long> plus, List<Long> minus, int k) {
		List<Long> list = new ArrayList<Long>();
		for(int i = 0; i < plus.size(); i++) {
			for(int j = 0; j < minus.size();j++) {
				list.add(plus.get(i) * minus.get(j));
			}
		}
		Collections.sort(list);
		System.out.println(list.get(k-1));
	}
}