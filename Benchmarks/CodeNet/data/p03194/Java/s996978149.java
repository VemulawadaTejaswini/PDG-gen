import java.util.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();
        int ans = 1;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= P; i++) {
            if (Math.pow((double) P, 1.0 / N) == (int) Math.pow((double) P, 1.0 / N)) {
                ans = (int) Math.pow((double) P, 1.0 / N);
                break;
            }
            if (P % i == 0) {
                P /= i;
                if (map.get(i) != null) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
                if (map.get(i) >= N) {
                    ans *= i;
                    map.put(i, 0);
                    //System.out.println(i);
                }
                i = 1;
                if (P == 1) break;
            }
        }
        System.out.println(ans);
    }
}