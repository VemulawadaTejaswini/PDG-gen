import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0;i < n;i++) a[i] = sc.nextLong();

        Map<Long, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i < n;i++) {
            long tmp = i - a[i];
            Integer e = map.get(tmp);
            if(e == null) {

            }
            else {
                count = count + e.intValue();
            }
            Integer tmpCount = map.get(a[i] + i);
            if(tmpCount == null) tmpCount = 0;
            map.put(a[i] + i, tmpCount + 1);
        }

        System.out.println(count);
    }

}
