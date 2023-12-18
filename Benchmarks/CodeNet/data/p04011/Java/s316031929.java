import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
    
        Map<String,Integer> map = countMultiple(s);
        final String result = isBeanty(map)? "Yes" : "No";
        System.out.println(result);
        sc.close();    
    }
    
    public static boolean isBeanty(Map<String,Integer> map){
        for (Entry<String,Integer> t: map.entrySet()) {
            if(t.getValue()%2 == 1) {
                return false;
            }
        }
        return true;
    }

    public static Map<String,Integer> countMultiple(String[] chars){
        Map<String,Integer> map = new HashMap<>();
        for (String s : chars) {
            if(map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            }else{
                map.put(s, 1);
            }
        }
        return map;
    }
}