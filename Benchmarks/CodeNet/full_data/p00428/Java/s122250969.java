import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Map;
import java.util.Collections;
import java.util.LinkedHashMap;

public class Main {
    public static Scanner sc;
    public static LinkedHashMap<Integer, Integer> map;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == 0 && m == 0) break;
            
            int[] ary = new int[m];
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (sc.nextInt() == 1) {
                        ary[j]++;
                    }
                }
            }
            
            map = new LinkedHashMap<>();
            
            for (int i = 0; i < m; i++) {
                map.put(i+1, ary[i]);
            }
            
            List<Map.Entry<Integer, Integer>> entry = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
            
            Collections.sort(entry, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o2.getValue().compareTo(o1.getValue());
                }
            });
            
            StringBuilder sb = new StringBuilder();
            for (Map.Entry e: entry) {
                sb.append(e.getKey()).append(" ");
            }
            sb.delete(sb.length()-1, sb.length());
            System.out.println(sb.toString());
        }
    }
}