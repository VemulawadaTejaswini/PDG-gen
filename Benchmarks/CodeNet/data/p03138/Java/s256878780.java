import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        //        ArrayList<Long> list = new ArrayList<>();

        Map<Long, Long> map = new HashMap<>();

        for (long i = 0; i < n; i++) {
            map.put(i, sc.nextLong());
        }

        sc.close();

        long max = map.get(0L);

        for (long i = 0; i < k; i++) {
            long tmp = 0;
            for (long j = 0; j < n; j++) {
                tmp += i ^ map.get(j);
            }
            max = Math.max(max, tmp);
        }

        System.out.println(max);
    }
}
