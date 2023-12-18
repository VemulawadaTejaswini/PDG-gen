
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int l = in.nextInt();
        int r = in.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = l; i <= r; i++) {
            set.add(i % 2019);
            if (set.size() > 2019) {
                break;
            }
        }

        long result = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                long tmp = (long) list.get(i) * (long) list.get(j) % 2019;
                result = Math.min(result, tmp);
            }
        }
        System.out.println(result);
    }
}