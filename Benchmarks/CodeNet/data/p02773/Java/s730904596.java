import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            String key = sc.next();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            }else {
                map.put(key, 1);
            }
        }
        int max = Collections.max(map.values());
        List<String> s = new ArrayList<>();
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue() == max ) {
                s.add(entry.getKey());
            }
        }
        Collections.sort(s);
        for(String ss : s) {
            System.out.println(ss);
        }
    }
}