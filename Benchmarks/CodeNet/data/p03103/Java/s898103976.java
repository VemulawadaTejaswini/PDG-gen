import java.util.*;
import java.util.Map.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> a = new HashMap<>();
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            a.put(i, sc.nextInt());
            b[i] = sc.nextInt();
        }
        List<Entry<Integer, Integer>> list_entries = new ArrayList<>(a.entrySet());
        Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2) {
                return obj1.getValue().compareTo(obj2.getValue());
            }
        });
        long money = 0;
        int counter = 0;
        for (Entry<Integer,Integer> entry : list_entries) {
            for (int i = 0; i < b[entry.getKey()] && counter < m; i++) {
                money += entry.getValue();
                counter++;
            }
            if (counter == m) {
                break;
            }
        }
        System.out.println(money);
        sc.close();
    }
}