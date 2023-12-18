import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        Map<Integer, Integer> A = new LinkedHashMap<>();
        for (int i = 0; i < N; i++) {

            A.put(i, Integer.parseInt(scanner.nextLine()));
        }

        Map<Integer, Integer> sorted = new LinkedHashMap<>(A);
        sorted.entrySet().stream().sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByKey()));

        for (int i = 0; i < N; i++) {

            int target = sorted.get(i);

            for (Map.Entry<Integer, Integer> s : sorted.entrySet()) {

                if (s.getValue() >= target && s.getKey() != i) {
                    System.out.println(s);
                    break;
                }
            }

        }

        scanner.close();

    }

    static Map<Integer, Integer> MapValueSort(Map<Integer, Integer> map, int n) {
        List<Integer> list = new ArrayList<>(map.values());
        List<Integer> list2 = new ArrayList<>();
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        if (n == 0) {
            Collections.sort(list);
        } else if (n == 1) {
            Collections.sort(list, Comparator.reverseOrder());
        }
        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (list.get(i) == entry.getValue() && list2.contains(entry.getKey()) == false) {
                    map2.put(entry.getKey(), entry.getValue());
                    list2.add(entry.getKey());
                    break;
                }
            }
        }
        return map2;
    }

}
