import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.ArrayList;

public class Main {
    public static Scanner sc;
    public static TreeMap<String, ArrayList<Integer>> map;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        map = new TreeMap<>();
        
        while (sc.hasNext()) {
            String s = sc.next();
            int n = sc.nextInt();
            
            if (!map.containsKey(s)) {
                ArrayList<Integer> ary = new ArrayList<>();
                ary.add(n);
                map.put(s, ary);
            } else {
                map.get(s).add(n);
            }
        }
        
        for (String key: map.keySet()) {
            StringBuilder sb = new StringBuilder();
            ArrayList<Integer> list = map.get(key);
            Collections.sort(list);
            sb.append(key).append(" ");
            for (Integer i: list) {
                sb.append(i).append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb.toString());
        }
    }
}