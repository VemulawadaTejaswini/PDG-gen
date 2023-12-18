import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int count = map.getOrDefault(a, 0);
            map.put(a, ++count);
        }

        List<Integer> candidate = new ArrayList<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (candidate.size() == 2) break;
            if (e.getValue() >=4) {
                candidate.add(e.getKey());
                candidate.add(e.getKey());
            } else if (e.getValue() >= 2) {
                candidate.add(e.getKey());
            }
        }

        if (candidate.size() != 2) {
            System.out.println(0);
        } else {
            System.out.println(candidate.get(0) * candidate.get(1));
        }
    }
}
