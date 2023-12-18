import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String A = sc.next();
        String B = sc.next();
        String C = sc.next();
        String[] ss = {A, B, C};

        int ans = 0;
        for(int i = 0; i < N; i++) {
            HashMap<Character, Integer> counts = new HashMap<>();
            for(int k = 0; k < ss.length; k++) {
                char c = ss[k].charAt(i);
                counts.put(c, counts.getOrDefault(c, 0) + 1);
            }
            int maxNum = Collections.max(counts.values());
            ans += (ss.length - maxNum);
        }

        System.out.println(ans);
    }
}
