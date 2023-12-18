import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int max=1;

		for(int i=0; i<N; i++){
			String str = sc.next();
			if(map.containsKey(str)){
				int num = map.get(str);
				map.replace(str, num+1);
				if(max<num+1){
					max = num+1;
				}
			}else{
				map.put(str, 1);
			}
		}
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());

		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				if(obj1.getValue()==obj2.getValue()){
					return obj1.getKey().compareTo(obj2.getKey());
				}else{
					return obj2.getValue().compareTo(obj1.getValue());
				}
			}
		});

		for(Entry<String, Integer> entry : list) {
			if(entry.getValue()==max){
				System.out.println(entry.getKey());
			}
		}
        
    }
}
