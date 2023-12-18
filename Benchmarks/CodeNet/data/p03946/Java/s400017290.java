import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.next());
            list.add(a);
            int temp = a - Collections.min(list);
            map.merge(temp, 1, Integer::sum);
        }
        Object[] ary = map.keySet().toArray();
        Arrays.sort(ary);
        System.out.println(map.get(ary[ary.length - 1]));
    }
}