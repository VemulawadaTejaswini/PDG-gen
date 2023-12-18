import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String tmp = s.substring(i, j+1);
                if (tmp.length() < 2) continue;
                Map<String, Integer> map = new HashMap<>();
                for (int k = 0; k < tmp.length(); k++) {
                    String sub = tmp.substring(k, k+1);
                    if (map.containsKey(sub)) {
                        map.put(sub, map.get(sub)+1);
                    } else {
                        map.put(sub, 1);
                    }
                }
                int ha = tmp.length()/2 + 1;
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() >= ha) {
                        System.out.println((i+1) + " " + (j+1));
                        return;
                    }
                }
            }
        }
        
        System.out.println("-1 -1");
    }
}
