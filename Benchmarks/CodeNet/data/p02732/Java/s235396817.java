import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = Long.parseLong(sc.next());
		List<Long> list = new ArrayList();
		Map<Long,Long> map = new HashMap();
		Map<Long,Long> map2 = new HashMap();
		Map<Long,Long> map3 = new HashMap();
		for(long i=0;i<N;i++){
			long a = Long.parseLong(sc.next());
			if(map.containsKey(a)){
				map.put(a, map.get(a)+1);
			} else {
				map.put(a,  1l);
			}
			list.add(a);
		}
		for(Entry<Long, Long> a:map.entrySet()){
			map2.put(a.getKey(), keisan(a.getValue()));
			map3.put(a.getKey(), keisan(a.getValue()-1));
		}
		long total = 0;
		for(Long a: map2.values()){
			total += a;
		}
//		System.out.println(map);
//		System.out.println(map2);
//		System.out.println(map3);
		for(Long a:list){
			System.out.println(total-map2.get(a)+map3.get(a));
		}
	}
	public static long keisan(long a){
		long aa = 1;
		for(long i=a ; i>a-2 ; i--){
			aa *= i;
		}
		return aa/2;
	}
}
