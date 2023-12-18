import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String,Integer> map = new TreeMap<String,Integer>();
		for (int i = 0; i < N; i++){
			String str = sc.next();
			if (map.containsKey(str)){
				map.put(str, map.get(str) + 1);
			}else{
				map.put(str,0);
			}
		}
      	List<Integer> hoge = new ArrayList<Integer>();
        int temp = -1;
		for(Map.Entry<String,Integer> entry : map.entrySet()){
			if ( temp < entry.getValue()){
             	temp = entry.getValue();
            }
		}
      	for(Map.Entry<String,Integer> entry : map.entrySet()){
			if ( temp == entry.getValue()){
             	System.out.println(entry.getKey());
            }
		}
	}
}