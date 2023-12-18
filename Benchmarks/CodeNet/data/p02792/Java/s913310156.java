import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        long N = 25;// Long.parseLong(sc.nextLine());
        // sc.close();
        long res = 0;
        Map<Map<Long, Long>, Long> pairMap = new HashMap<>();

        for (long i = 1; i <= N; i++) {
            Map<Long, Long> map = getFandLPair(i);
            Long count = pairMap.get(map);
            if (Objects.isNull(count)) {
                pairMap.put(map, 1L);
            } else {
                count++;
                pairMap.put(map, count);

            }
        }

        for (long i = 1; i <= N; i++) {
            Map<Long, Long> pMap = getFandLPair(i);
            Long key = pMap.keySet().iterator().next();
            Map<Long, Long> gMap = new HashMap<Long, Long>();
            gMap.put(pMap.get(key), key);
            Long count = pairMap.get(gMap);
            if (Objects.isNull(count)) {
                continue;
            }
            res += count;
        }

        System.out.println(res);
    }

    public static Map<Long, Long> getFandLPair(Long x) {
        Map<Long, Long> ret = new HashMap<>();
        String Z = x.toString();
        Long a = Long.parseLong(String.valueOf(Z.charAt(0)));
        Long b = Long.parseLong(String.valueOf(Z.charAt(Z.length() - 1)));
        ret.put(a, b);
        return ret;
    }

}