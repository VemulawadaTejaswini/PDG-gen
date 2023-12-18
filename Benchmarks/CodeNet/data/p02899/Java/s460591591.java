import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Map<Integer, Integer> mMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            mMap.put( sc.nextInt(), i + 1);
        }

        // キーでソートする
        Object[] mapkey = mMap.keySet().toArray();
        Arrays.sort(mapkey);

        int ct = 0;
        for (Integer nKey : mMap.keySet())
        {
            ct++;
            if (ct != N) {
                System.out.print(mMap.get(nKey) + " ");
            } else {
                System.out.print(mMap.get(nKey));
            }
        }
    }
}
