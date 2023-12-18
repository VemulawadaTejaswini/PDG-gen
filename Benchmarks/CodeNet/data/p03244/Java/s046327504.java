import java.util.*;
import java.util.Map.Entry;

import static java.lang.Integer.*;
//import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int[] v = new int[n];
		HashMap<Integer, Integer> kisu = new HashMap<>();
		HashMap<Integer, Integer> gusu = new HashMap<>();
		for(i=0;i<n;i++) {
			v[i] = parseInt(sc.next());
			if((i&1)==0) {
				Integer va = gusu.get(v[i]);
				if(va == null) {
					va = 0;
				}
				gusu.put(v[i],va.intValue()+1);
			} else {
				Integer va = kisu.get(v[i]);
				if(va == null) {
					va = 0;
				}
				kisu.put(v[i],va.intValue()+1);
			}
		}
//		out.println(n);
//		out.println(Arrays.toString(v));
		sc.close();
		List<Entry<Integer, Integer>> entKisu = new ArrayList<Entry<Integer, Integer>>(kisu.entrySet());
		Collections.sort(entKisu, new Comparator<Entry<Integer, Integer>>(){
			@Override
			public int compare(Entry<Integer,Integer> ent1, Entry<Integer,Integer> ent2) {
                return ent2.getValue().compareTo(ent1.getValue());
            }
		});
		List<Entry<Integer, Integer>> entGusu = new ArrayList<Entry<Integer, Integer>>(gusu.entrySet());
		Collections.sort(entGusu, new Comparator<Entry<Integer, Integer>>(){
			@Override
			public int compare(Entry<Integer,Integer> ent1, Entry<Integer,Integer> ent2) {
                return ent2.getValue().compareTo(ent1.getValue());
            }
		});
		int ans;
		if(entKisu.get(0).getKey().intValue() != entGusu.get(0).getKey().intValue()) {
			ans = n - entKisu.get(0).getValue() - entGusu.get(0).getValue();
		} else {
			if(entKisu.get(0).getKey().intValue() > entGusu.get(0).getKey().intValue()) {
				ans = n - entKisu.get(0).getValue() - entGusu.get(1).getValue();
			} else if(entKisu.get(0).getKey().intValue() < entGusu.get(0).getKey().intValue()) {
				ans = n - entKisu.get(1).getValue() - entGusu.get(0).getValue();
			} else {
				if(entKisu.size() == 1) {
					ans = n - entKisu.get(0).getValue();
				} else {
					ans = n - entKisu.get(0).getValue() - Math.max(entKisu.get(1).getValue().intValue(), entGusu.get(1).getValue().intValue());
				}
			}
		}
		out.println(ans);
	}
}
