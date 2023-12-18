import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javafx.util.Pair;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N,M;
		N= sc.nextInt();
		M = sc.nextInt();
		ArrayList<Pair<Long,Integer>> list = new ArrayList<Pair<Long,Integer>>();
		for(int i = 0; i<N; i++) {
			list.add( new Pair<Long, Integer>(sc.nextLong(),sc.nextInt()) );
		}
		list.sort(Comparator.comparing(Pair::getKey));
		long ans = 0;
		int count = 0;
		for(Pair<Long,Integer> pair : list) {
			if(pair.getValue() < M-count) {
				count += pair.getValue();
				ans += pair.getKey()*pair.getValue();
			} else {
				ans += (M-count) * pair.getKey();
				break;
			}
		}
		System.out.println(ans);
	}

}
