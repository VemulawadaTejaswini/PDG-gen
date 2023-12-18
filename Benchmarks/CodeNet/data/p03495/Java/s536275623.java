import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i< n; i++) {
            A[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(arr, new SortEntry());
        System.out.println(arr);
        int count = 0;
        int l = arr.size();
        for (Map.Entry<Integer, Integer> e: arr) {
            if (l <= k) break;
            count += e.getValue();
            l--;
        }
        System.out.println(count);
    }
    public static class SortEntry implements Comparator<Map.Entry<Integer, Integer>> {
        public int compare(Map.Entry<Integer, Integer> a, Map.Entry<Integer, Integer> b) {
            return a.getValue() - b.getValue();
        }
    }
}
