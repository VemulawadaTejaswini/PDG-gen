import java.util.*;
class Main{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] argv){
		c();
	}
  	static void c(){
		int n = scan.nextInt();
		Map<Integer, Integer> mapEven = new HashMap<>();
		Map<Integer, Integer> mapOdd = new HashMap<>();
		for(int i=0;i<n;i++){
			int temp = scan.nextInt();
			if(i%2==0){
				mapEven.put(temp,mapEven.getOrDefault(temp, 0)+1);
			}
			else{
				mapOdd.put(temp,mapOdd.getOrDefault(temp, 0)+1);
			}
		}
		List<Map.Entry<Integer, Integer>> o = new ArrayList<>(mapOdd.entrySet());
    	List<Map.Entry<Integer, Integer>> e = new ArrayList<>(mapEven.entrySet());
    	o.sort((o1, o2) -> o2.getValue() - o1.getValue());
    	e.sort((o1, o2) -> o2.getValue() - o1.getValue());
		int o1 = o.get(0).getValue();
    	int o2 = o.size() == 1 ? 0 : o.get(1).getValue();
    	int e1 = e.get(0).getValue();
    	int e2 = e.size() == 1 ? 0 : e.get(1).getValue();
		if (!o.get(0).getKey().equals(e.get(0).getKey())) {
      		System.out.println(n - o1 - e1);
    	}
		else {
      		System.out.println(n - Math.max(o1 + e2, o2 + e1));
    	}
	}
}