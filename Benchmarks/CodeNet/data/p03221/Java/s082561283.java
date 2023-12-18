import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        
        int p, y;
        TreeMap<Integer, Integer>[] map1 = new TreeMap[n+1];
        for(int i = 1; i <= n; i++){
            map1[i] = new TreeMap<>();
        }
        for(int i = 1; i <= m; i++){
            p = Integer.parseInt(sc.next());
            y = Integer.parseInt(sc.next());
            map1[p].put(y, i);
        }
        
        TreeMap<Integer, String> map2 = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            if(map1[i].isEmpty()){
                continue;
            }
            Set set = map1[i].keySet();
            List<Integer> list = new ArrayList<>(set);
            for(int j = 1; j <= list.size(); j++){
                String s1 = Integer.toString(i);
                while(s1.length() < 6){
                    s1 = "0" + s1;
                }
                String s2 = Integer.toString(j);
                while(s2.length() < 6){
                    s2 = "0" + s2;
                }
                
                map2.put(map1[i].get(list.get(j-1)), s1 + s2);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        map2.keySet().forEach((key) -> {
            sb.append(map2.get(key)).append(System.lineSeparator());
        });
        System.out.println(sb);
    }
}