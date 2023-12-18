import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++){
            set.add(sc.next());
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("M",0);
        map.put("A",0);
        map.put("R",0);
        map.put("C",0);
        map.put("H",0);

        for (String s: set){
            String _s = String.valueOf(s.charAt(0));
            if (map.containsKey(_s)) {
                map.put(_s, map.get(_s) + 1);
            }
        }
        long sum = 0;

        sum += map.get("M")*map.get("A")*map.get("R");
        sum += map.get("M")*map.get("A")*map.get("C");
        sum += map.get("M")*map.get("A")*map.get("H");
        sum += map.get("M")*map.get("R")*map.get("C");
        sum += map.get("M")*map.get("R")*map.get("H");
        sum += map.get("M")*map.get("C")*map.get("H");
        sum += map.get("A")*map.get("R")*map.get("C");
        sum += map.get("A")*map.get("R")*map.get("H");
        sum += map.get("A")*map.get("C")*map.get("H");
        sum += map.get("R")*map.get("C")*map.get("H");

        System.out.println(sum);
    }
}
