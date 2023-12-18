import java.util.*;

public class Main {
	
	static List<Long> list = new ArrayList<>();
	static Map<String,Long> used = new HashMap<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		long[] num = Arrays.stream(sc.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
		for (long l : num) {
			list.add(l);
		}
		Collections.sort(list);
		System.out.println(getMax(list));
		
	}
	
	public static long getMax(List<Long> li) {
		long c = 0;
		
		for(int i=0; i<li.size()-1; i++) {
			long max = 0;
			for(int j = i+1; j<li.size(); j++) {
				long v = li.get(i) + li.get(j);
				if((v & (v-1)) == 0) {
					String k = createKey(li);
					if(used.containsKey(k)) {
						max = used.get(k);
					}else {
						long m = 1 + getMax(sublist(i,j,li));
						max = Math.max(max, m);
						used.put(k, max);
					}
				}
			}
			c = Math.max(max, c);
		}
		return c;
	}
	
	public static String createKey(List<Long> l) {
		Collections.sort(l);
		StringBuilder sb = new StringBuilder();
		for (Long lon : l) {
			sb.append(lon + " ");
		}
		return new String(sb);
	}
	
	public static List<Long> sublist(int i, int j, List<Long> l){
		ArrayList<Long> tmp = new ArrayList<>();
		for (long a : l) {
			tmp.add(a);
		}
		tmp.remove(i);
		tmp.remove(j-1);
		return tmp;
	}

}
