import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String,List> t = new TreeMap<String,List>();
		while( sc.hasNext() ) {
			String key = sc.next();
			List<Integer> l;
			if ( t.containsKey(key) )
				l = t.get(key);
			else
				l = new ArrayList<Integer>();
			l.add(sc.nextInt());
			t.put(key,l);
		}
		Iterator it = t.keySet().iterator();
		while (it.hasNext()) {
			Object o = it.next();
			List<Integer> l = t.get(o);
			System.out.println(o);
			Collections.sort(l);
			for ( int i = 0; i < t.get(o).size(); i++ )
				System.out.print(l.get(i)+" ");
			System.out.println();
		}
	}
}