import java.util.*;

class Main {

    static long INF = 2_000_000_000_000_000_000L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int[] A = new int[L];
        for (int i=0;i<L;i++) {
            A[i] = sc.nextInt();
        }
        long[] ruiseki_A = new long[L+1];
        for (int i=0;i<L;i++) {
            ruiseki_A[i+1] = ruiseki_A[i]+(A[i]+1)%2;
        }

        long[][] left = new long[L+1][2]; // left[i][0]: zero, left[i][1]: two
        for (int i=0;i<L;i++) {
            left[i+1][0] = left[i][0] + A[i];
            left[i+1][1] = Math.min(left[i][0] + ((A[i] == 0)?2:(A[i]%2)), left[i][1] + ((A[i] == 0)?2:(A[i]%2)));
        }

        long[][] right = new long[L+1][2];
        for (int i=L;i>=1;i--) {
            right[i-1][0] = right[i][0] + A[i-1];
            right[i-1][1] = Math.min(right[i][0] + ((A[i-1] == 0)?2:(A[i-1]%2)), right[i][1] + ((A[i-1] == 0)?2:(A[i-1]%2)));
        }

        TreeMap<Long, Integer> map = new TreeMap<Long, Integer>();
        for (int i=0;i<L+1;i++) {
            long tmp = Math.min(right[i][0], right[i][1]) + ruiseki_A[i];
            if (map.containsKey(tmp)) {
                map.put(tmp, map.get(tmp)+1);
            } else {
                map.put(tmp, 1);
            }
        }
        // System.out.println(map);
        // System.out.println(Arrays.toString(ruiseki_A));

        long ans = INF;
        for (int i=0;i<L+1;i++) {
            long tmp = Math.min(left[i][0], left[i][1]);
            ans = Math.min(ans, tmp + map.firstKey() - ruiseki_A[i]);
            // System.out.println("i, val: "+i+" "+(tmp + map.firstKey() - ruiseki_A[i]));
            // ans = Math.min(ans, tmp + map.firstKey());

            long tmp_key = Math.min(right[i][0], right[i][1]) + ruiseki_A[i];
            if (map.get(tmp_key) > 1) {
                map.put(tmp_key, map.get(tmp_key) - 1);
            } else {
                map.remove(tmp_key);
            }
        }
        System.out.println(ans);
        // System.out.println(Arrays.deepToString(left));
        // System.out.println(Arrays.deepToString(right));
    }
}