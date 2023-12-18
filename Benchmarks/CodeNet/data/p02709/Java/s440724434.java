import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            map.put(i, a[i]);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((e1,e2) -> (
                e2.getValue() - e1.getValue()
        ));
        int l = 0;
        int r = n-1;
        double mid = (double)(n-1)/2;
        int count = 0;
        for (Map.Entry<Integer, Integer> e : list) {
            int index = e.getKey();
            int val = e.getValue();
            // move left
            if ((double)index >= mid) {
                count += val * Math.abs(index - l);
                l++;
            } else {
                count += val * Math.abs(index - r);
                r--;
            }
        }
        System.out.println(count);
    }
}