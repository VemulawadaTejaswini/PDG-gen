import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

import java.util.Comparator;


import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.TreeMap;


class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		while(in.hasNext()){
			int n = in.nextInt();
			Set<Integer> s = new TreeSet<Integer>();
			for(int i = 1; i< n; i++) s.add(i * i % n);
			Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
			Iterator it = s.iterator();
			while(it.hasNext()){
				Iterator it2 = s.iterator();
				int a = (int)it.next();
				while(it2.hasNext()){
					int b = (int)it2.next();
					if(a != b){
						int c = a - b;
						if(c < 0) c += n;
						if(c > (n - 1) / 2) c = n - c;
						if(m.get(c) == null) m.put(c, 1);
						else m.put(c, m.get(c) + 1);
					}
				}
			}
			Iterator<Integer> it3 = m.keySet().iterator();
			while(it3.hasNext()){
				Object key = it3.next();
				System.out.println(m.get(key));
			}
		}

	}
}