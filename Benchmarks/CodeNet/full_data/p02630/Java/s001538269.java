import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int count = map.getOrDefault(key, 0);
            map.put(key, ++count);
            sum += (long)key;
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();

            int bCount = map.getOrDefault(b, 0);
            long tmp = sum - (long)(b * bCount) + (long)(c * bCount);
            System.out.println(tmp);
            map.put(b, 0);
            int cCount = map.getOrDefault(c, 0);
            map.put(c, bCount + cCount);
            sum = tmp;
        }
    }
}