
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String s = sc.next();
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String s2 = new String(ch);
            if(map.containsKey(s2)) {
                map.put(s2, map.get(s2)+1);
            } else {
                map.put(s2, 0);
            }
        }
        long res = 0;
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            res += entry.getValue();
        }
        System.out.println(res);
    }
}
