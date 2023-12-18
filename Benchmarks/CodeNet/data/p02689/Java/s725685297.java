import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] hs = new long[n];
		for(int i=0; i<n; i++){
			hs[i] = sc.nextLong();
		}
		Map<Integer, List<Integer>> map = new HashMap<>();
		for(int i=0; i<m; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			List<Integer> aList = map.get(a);
			List<Integer> bList = map.get(b);
			if(aList == null){
				aList = new ArrayList<Integer>();
				aList.add(b);
				map.put(a, aList);
			} else {
				if(!aList.contains(b)) aList.add(b);
				map.put(a, aList);
			}
			if(bList == null){
				bList = new ArrayList<Integer>();
				bList.add(a);
				map.put(b, bList);
			} else {
				if(!bList.contains(a)) bList.add(a);
				map.put(b, bList);
			}
		}
		int ans=0;
		for (Map.Entry<Integer, List<Integer>> ns : map.entrySet()) {
            int key = ns.getKey();
			List<Integer> values = ns.getValue();
			long valuesMax = 0;
			for(int tou: values){
				valuesMax = Math.max(hs[tou-1], valuesMax);
			}
			if(hs[key-1] >= valuesMax){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
