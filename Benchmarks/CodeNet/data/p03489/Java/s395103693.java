import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class goodSeq
{
    public static void main(String[] args) {
        try {
            int cnt = 0;
            HashMap<Integer, Integer> hm = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                hm.put(ar[i], 0);
            }
            for (int i = 0; i < n; i++) {
                hm.put(ar[i], hm.get(ar[i]) + 1);
            }
            for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
                int v = m.getValue();
                int k = m.getKey();
                if (v < k)
                    cnt = cnt + v;
                else
                    cnt = cnt + v - k;
            }
            System.out.println(cnt);
        }
        catch (Exception e)
        {
            return;
        }
    }
}
