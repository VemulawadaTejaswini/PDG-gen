import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp)+1);
            } else {
                map.put(tmp, 1);
            }
        }

//        System.out.println(map);

        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>();

        for (int t: set) {
            if (map.get(t) >= 2) list.add(t);
        }

        Collections.reverse(list);

        if (list.size() < 2) {
            System.out.println(0);
        } else {
            System.out.println(list.get(0) * list.get(1));
        }


    }

}

