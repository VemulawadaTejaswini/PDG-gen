import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args){
		int i, q, order;
		String key, key2, str = "a";
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				order = sc.nextInt();
				key = sc.next();
				switch(order) {
				case 0 : 
					tm.put(key, sc.nextInt());
				case 1 : 
					if(tm.get(key) == null) {
						System.out.println(0);
					}else {
						System.out.println(tm.get(key));
					}
				case 2 : 
					tm.remove(key);
				case 3 : 
					key2 = sc.next();
					Iterator<String> it = tm.keySet().iterator();
					while (it.hasNext()) {
						str = it.next();
						if(str.compareTo(key2) <= 0 && str.compareTo(key) >= 0) {
							System.out.println(str + " " + tm.get(str));
						}else if(str.compareTo(key2) > 0) {
							break;
						}
					}
				}
			}
		}
	}
}


