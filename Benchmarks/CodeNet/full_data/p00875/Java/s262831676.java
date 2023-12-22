import java.util.*;

public class Asia2009B_Ito{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			if(n == 0) break;

			String a[] = new String[n], b[] = new String[n];
			for(int i=0;i<n;i++){
				a[i] = sc.next();
				b[i] = sc.next();
			}
			String from=sc.next(), to=sc.next();

			HashMap<String,Integer> open = new HashMap<String,Integer>();
			HashMap<String,Integer> next = new HashMap<String,Integer>();
			HashMap<String,Integer> end = new HashMap<String,Integer>();

			open.put(from,0);
			while(!open.isEmpty()){
				for(String s : open.keySet()){
					int cost = open.get(s);
					for(int i=0;i<n;i++){
						String ns = s.replaceAll(a[i],b[i]);
						if(s.equals(ns)) continue;
						if(ns.length() >= 6){
							if(end.containsKey(ns)) continue;
							end.put(ns,cost+1);
							continue;
						}
						if(next.containsKey(ns)) continue;
						next.put(ns,cost+1);
					}
				}
				open = next;
				next = new HashMap<String,Integer>();
			}

			int min = Integer.MAX_VALUE;
			open.put(to,0);
			while(!open.isEmpty()){
				for(String s : open.keySet()){
					int cost = open.get(s);

					if(end.containsKey(s)){
						min = Math.min(min,cost+end.get(s));
						continue;
					}
					for(int i=0;i<n;i++){
						String ns = s.replaceAll(b[i],a[i]);
						if(s.equals(ns)) continue;
						if(next.containsKey(ns)) continue;
						next.put(ns,cost+1);
					}
				}
				open = next;
				next = new HashMap<String,Integer>();
			}

			System.out.println(min==Integer.MAX_VALUE ? -1 : min);
		}

	}
}