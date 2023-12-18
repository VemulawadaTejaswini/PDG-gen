import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] max = new int[n];
        max[n-1] = a[n-1];
        for (int i = 1; i < n; i++) {
            max[n-1-i] = Math.max(max[n-i], a[n-1-i]);
        }
        Map<Integer, Integer> map = new HashMap<>();
        int dmax = 0;
        map.put(0, 0);
        for (int i = 0; i < n-1; i++) {
            int d = max[i+1] - a[i];
            if(dmax < d) dmax = d;
            if(!map.containsKey(d)) map.put(d, 0);
            map.put(d, map.get(d) + 1);
        }
        System.out.println(map.get(dmax));
        sc.close();

    }

}
