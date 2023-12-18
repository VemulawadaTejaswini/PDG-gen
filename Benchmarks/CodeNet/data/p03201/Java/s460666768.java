import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set2 = new TreeSet<>();
        int base = 1;
        while (base < 1000000000) {
            base *= 2;
            set2.add(base);
        }
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list, new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                return i2.intValue() - i1.intValue();
            }
        });
        System.out.println(list);
        int count = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int target = list.get(i);
            int next = set2.higher(target) - target;
            int left = i + 1;
            int right = list.size() - 1;
            while (left <= right) {
                int m = (left + right) / 2;
                if (list.get(m) == next) {
                    count++;
                    list.remove(m);
                    break;
                } else if (list.get(m) > next) {
                    left = m + 1;
                } else {
                    right = m;
                }
            }
        }
        System.out.println(count);
    }
}
