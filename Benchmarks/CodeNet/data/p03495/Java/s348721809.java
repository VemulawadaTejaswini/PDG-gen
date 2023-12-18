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
                map.put(A[i], 0);
            }
        }
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(arr, (a, b) -> a.getValue() - b.getValue());
        int count = 0;
        int l = arr.size();
        for (Map.Entry<Integer, Integer> e: arr) {
            count += e.getValue();
            l--;
            if (l <= k) break;
        }
        System.out.println(count);
    }
}