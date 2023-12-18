import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] A = new int[N];
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for (int i=0;i<N;i++) {
            A[i] = Integer.parseInt(sc.next());
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i])+1);
            } else {
                map.put(A[i], 1);
            }
        }

        int ans = 0;
        while (!map.isEmpty()) {
            int kk = map.lastKey();
            if (map.get(map.lastKey())>1) {
                map.put(map.lastKey(), map.get(map.lastKey())-1);
            } else {
                map.remove(map.lastKey());
            }
            String ss = Integer.toBinaryString(kk);
            // System.out.println((long)Math.pow(2, ss.length())-kk);
            int val = (int)((long)Math.pow(2, ss.length())-kk);
            if (map.containsKey(val)) {
                if (map.get(val)>1) {
                    map.put(val, map.get(val)-1);
                } else {
                    map.remove(val);
                }
                ans++;
            }
        }
        // System.out.println(map);
        System.out.println(ans);
    }
}