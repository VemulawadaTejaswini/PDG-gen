import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Entry<Integer, Integer>> list = new ArrayList<>(n);
		for(int i = 0; i< n; i++) list.add(new SimpleEntry<Integer, Integer>(i, sc.nextInt()));
		Set<Integer> left = new HashSet<>(n/2);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>(){

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO 自動生成されたメソッド・スタブ
				return o1.getValue() - o2.getValue();
			}

		});
		for(int i = 0; i < list.size(); i++){
			int x = list.get(i).getKey();
			if(list.size() /2 > i) left.add(x);
		}
		int leftHalf = list.get(list.size() / 2 -1).getValue();
		int rightHalf = list.get(list.size()/2).getValue();
		for(int i = 0; i < n ; i++){
			System.out.println(left.contains(i) ? rightHalf : leftHalf);
		}


	}

}