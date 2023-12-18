import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Integer> lst = new ArrayList<Integer>();
		for(int i = 0 ; i < N ; ++i){
			lst.add(sc.nextInt());
		}
		int k = 1;
		TreeSet<Integer> rangeSet = new TreeSet<Integer>();
		for(int i = 0 ; i < K - 1; ++i){
			rangeSet.add(lst.get(i));
			if(lst.get(i) < lst.get(i + 1)){
				++k;
			}else{
				k = 1;
			}
		}
		rangeSet.add(lst.get(K -1));
		int fix = k >= K ? 1 : 0;
		int same = 0;
		int sameFix = 0;
		for(int i = K ; i < lst.size() ; ++i){
			if(lst.get(i - 1) < lst.get(i)){
				++k;
			}else{
				k = 1;
			}
			boolean isFix = false;
			if(k >= K){
				isFix = true;
				fix++;
			}
			rangeSet.add(lst.get(i));
			int min = rangeSet.first();
			int max = rangeSet.last();
			if(lst.get(i - K) == min && lst.get(i) == max){
				++same;
				if(isFix){
					++sameFix;
				}
			}
//			System.out.println(rangeSet);
			rangeSet.remove(lst.get(i - K));
		}
//		System.out.println(fix+" "+same+" "+sameFix);
		int ans = N - K + 1;
		if(fix > 1){
			ans -= fix - 1;
		}
		ans -= same - sameFix;
		// m m2 K max max+1
		// 
		// min K-1 max
		// min K-1 max
		// min K-1 max
		// 021453
		// 021453
		System.out.println(ans);
		/*
		for(int i = 0 ; i + K <= N ; ++i){
			List<Integer> head = new ArrayList<>(lst.subList(0, i));
			List<Integer> middle = new ArrayList<>(lst.subList(i, i + K));
			List<Integer> tail = new ArrayList<>(lst.subList(i + K, lst.size()));
			Collections.sort(middle);
			head.addAll(middle);
			head.addAll(tail);
			System.out.println(head);
		}
		*/
		// 10 4
		//2 0 1 3 7 5 4 6 8 9
	}
}
