import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int duplicatedCount = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list.add(a);
            if (!map.containsKey(a)) {
                map.put(a, 0);
            } else {
                duplicatedCount += 1;
            }
            map.put(a, map.get(a) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (duplicatedCount == 0) {
                System.out.println(0);
            } else {
                int a = list.get(i);
                int total = calc(a, map);
                System.out.println(total);
            }
        }
    }

    static int calc(int a, Map<Integer, Integer> map) {
        int total = 0;
        for (int key : map.keySet()) {
            int num = map.get(key);
            if (key == a) {
                num = num - 1;
            }

            if(num <= 1){
                continue;
            }
            total += ((num * num) - num) / 2;
        }
        return total;
    }
}