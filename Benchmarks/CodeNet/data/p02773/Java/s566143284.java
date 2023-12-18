
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer N = Integer.parseInt(scanner.next());

        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            String key = scanner.next();
            Integer count = map.get(key);
            map.put(key, (count == null) ? 1 : count + 1);
        }


        Integer max=0;
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        for (String key : map.keySet()) {
            if(map.get(key)  == max) System.out.println(key);
        }
    }
}
