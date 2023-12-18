import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            String str = sc.next();
            if(map.containsKey(str)){
                map.replace(str,map.get(str)+1);
            }else{
                map.put(str, 1);
            }
        }
        List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
            Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
                public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
                    if(obj2.getValue() != obj1.getValue()){
                        return obj2.getValue().compareTo(obj1.getValue());
                    }else{
                        return obj1.getKey().compareTo(obj2.getKey());
                    }
                    
                }
            });
        int max =list_entries.get(0).getValue();
        
        list_entries.stream().filter(e -> e.getValue() >= max).forEach(e -> System.out.println(e.getKey()));
    }
}
